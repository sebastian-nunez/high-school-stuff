import React, { Component } from "react";
import { connect } from "react-redux";
import axiosInstance from "../../axios-orders";
import BuildControls from "../../components/Burger/BuildControls/BuildControls";
import Burger from "../../components/Burger/Burger";
import OrderSummary from "../../components/Burger/OrderSummary/OrderSummary";
import Modal from "../../components/UI/Modal/Modal";
import Spinner from "../../components/UI/Spinner/Spinner";
import withErrorHandler from "../../hoc/withErrorHandler/withErrorHandler";
import * as actionTypes from "../../store/actionTypes";

class BurgerBuilder extends Component {
  state = {
    isPurchasing: false,
    isLoading: false,
    error: false,
  };

  // componentDidMount() {
  // axiosInstance.get("/ingredients.json")
  //   .then(res => {
  //     this.setState({
  //       ingredients: {
  //         salad: res.data.meat,
  //         bacon: res.data.bacon,
  //         cheese: res.data.cheese,
  //         meat: res.data.meat
  //       }
  //     }, () => {
  //       let totalPrice = BASE_COST;
  //       for (let key in this.state.ingredients) {
  //         totalPrice += INGREDIENT_PRICES[key] * this.state.ingredients[key];
  //       }
  //
  //       this.setState({
  //         isPurchaseable: totalPrice !== BASE_COST,
  //         totalPrice
  //       });
  //     });
  //   })
  //   .catch(err => {
  //     this.setState({ error: true });
  //   });
  // }

  purchaseHandler = () => {
    this.setState({ isPurchasing: true });
  };

  purchaseCancelHandler = () => {
    this.setState({ isPurchasing: false });
  };

  purchaseContinueHandler = () => {
    this.props.history.push("/checkout");
  };

  updatePurchaseState = (ingredients) => {
    let isPurchaseable = false;
    for (let key in ingredients) {
      if (ingredients[key] > 0) {
        isPurchaseable = true;
        break;
      }
    }

    return isPurchaseable;
  };

  render() {
    const disabledInfo = { ...this.props.ingredients };
    for (let key in disabledInfo) {
      disabledInfo[key] = disabledInfo[key] < 1;
    }

    let orderSummary = <Spinner />;
    if (!this.state.isLoading && this.props.ingredients) {
      orderSummary = (
        <OrderSummary
          ingredients={this.props.ingredients}
          totalPrice={this.props.totalPrice}
          purchaseCancelHandler={this.purchaseCancelHandler}
          purchaseContinueHandler={this.purchaseContinueHandler}
        />
      );
    }

    let burgerInterface = this.state.error ? (
      <p>Ingredients can't be loaded! </p>
    ) : (
      <Spinner />
    );
    if (this.props.ingredients && this.props.totalPrice) {
      burgerInterface = (
        <>
          <Burger ingredients={this.props.ingredients} />
          <BuildControls
            totalPrice={this.props.totalPrice}
            addIngredientHandler={this.props.onAddIngredient}
            removeIngredientHandler={this.props.onRemoveIngredient}
            isPurchaseable={this.updatePurchaseState(this.props.ingredients)}
            purchaseHandler={this.purchaseHandler}
            disabledInfo={disabledInfo}
          />
        </>
      );
    }

    return (
      <>
        <Modal
          show={this.state.isPurchasing}
          closeModalHandler={this.purchaseCancelHandler}
        >
          {orderSummary}
        </Modal>

        {burgerInterface}
      </>
    );
  }
}

const mapStateToProps = (state) => {
  return {
    ingredients: state.ingredients,
    totalPrice: state.totalPrice,
  };
};

const mapDispatchToProps = (dispatch) => {
  return {
    onAddIngredient: (ingredientName) =>
      dispatch({
        type: actionTypes.ADD_INGREDIENT,
        ingredientName,
      }),
    onRemoveIngredient: (ingredientName) =>
      dispatch({
        type: actionTypes.REMOVE_INGREDIENT,
        ingredientName,
      }),
  };
};

export default connect(
  mapStateToProps,
  mapDispatchToProps
)(withErrorHandler(BurgerBuilder, axiosInstance));
