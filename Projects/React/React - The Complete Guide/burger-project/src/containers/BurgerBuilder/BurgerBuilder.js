import React, { Component } from "react";

import axiosInstance from "../../axios-orders";

import Burger from "../../components/Burger/Burger";
import BuildControls from "../../components/Burger/BuildControls/BuildControls";
import Modal from "../../components/UI/Modal/Modal";
import OrderSummary from "../../components/Burger/OrderSummary/OrderSummary";
import Spinner from "../../components/UI/Spinner/Spinner";
import withErrorHandler from "../../hoc/withErrorHandler/withErrorHandler";

const BASE_COST = 1.19;

const INGREDIENT_PRICES = {
  salad: 0.15,
  cheese: 0.2,
  bacon: 0.5,
  meat: 2.95
};

class BurgerBuilder extends Component {
  state = {
    ingredients: null,
    totalPrice: BASE_COST,
    isPurchaseable: false,
    isPurchasing: false,
    isLoading: false,
    error: false
  };

  componentDidMount() {
    axiosInstance.get("/ingredients.json")
      .then(res => {
        this.setState({ ingredients: res.data }, () => {
          let totalPrice = BASE_COST;
          for (let key in this.state.ingredients) {
            totalPrice += INGREDIENT_PRICES[key] * this.state.ingredients[key];
          }

          this.setState({
            isPurchaseable: totalPrice !== BASE_COST,
            totalPrice
          });
        });
      })
      .catch(err => {
        this.setState({ error: true });
      });
  }

  addIngredientHandler = type => {
    // updates the quantity of this type
    const oldCount = this.state.ingredients[type];
    const updatedCount = oldCount + 1;

    const updatedIngredients = { ...this.state.ingredients };
    updatedIngredients[type] = updatedCount;

    // handles the new price total
    const priceAddition = INGREDIENT_PRICES[type];

    const oldTotal = this.state.totalPrice;
    const newTotal = oldTotal + priceAddition;

    this.setState({
        ingredients: updatedIngredients,
        totalPrice: newTotal
      }, () => this.setState({ isPurchaseable: (this.state.totalPrice > BASE_COST + 0.01) })
    );
  };

  removeIngredientHandler = type => {
    this.setState((prevState, props) => {
        // updates the quantity of this type
        const oldCount = prevState.ingredients[type];
        if (oldCount <= 0) {
          return;
        }
        const updatedCount = oldCount - 1;

        const updatedIngredients = { ...prevState.ingredients };
        updatedIngredients[type] = updatedCount;

        // handles the new total
        const priceDeduction = INGREDIENT_PRICES[type];

        const oldTotal = prevState.totalPrice;
        const newTotal = oldTotal < BASE_COST ? BASE_COST : oldTotal - priceDeduction;

        return {
          ingredients: updatedIngredients,
          totalPrice: newTotal
        };
      }, () => this.setState({ isPurchaseable: (this.state.totalPrice > BASE_COST + 0.01) })
    );
  };

  purchaseHandler = () => {
    this.setState({ isPurchasing: true });
  };

  purchaseCancelHandler = () => {
    this.setState({ isPurchasing: false });
  };

  purchaseContinueHandler = () => {
    this.setState({ isLoading: true });

    const order = {
      ingredients: this.state.ingredients,
      totalPrice: parseFloat(this.state.totalPrice.toFixed(2)),
      customer: {
        name: "Max S.",
        address: {
          street: "123 S. Westwood Rd.",
          zipcode: "22465",
          country: "United States"
        },
        email: "max_s@gmail.com"
      },
      deliveryMethod: "expedited"
    };

    axiosInstance.post("/orders.json", order)
      .then(res => this.setState({ isLoading: false, isPurchasing: false }))
      .catch(err => this.setState({ isLoading: false, isPurchasing: false }));
  };

  render() {
    const disabledInfo = { ...this.state.ingredients };
    for (let key in disabledInfo) {
      disabledInfo[key] = (disabledInfo[key] < 1);
    }

    let orderSummary = <Spinner />;
    if (!this.state.isLoading && this.state.ingredients) {
      orderSummary = (
        <OrderSummary
          ingredients={this.state.ingredients}
          totalPrice={this.state.totalPrice}
          purchaseCancelHandler={this.purchaseCancelHandler}
          purchaseContinueHandler={this.purchaseContinueHandler}
        />
      );
    }

    let burgerInterface = this.state.error ? <p>Ingredients can't be loaded! </p> : <Spinner />;
    if (this.state.ingredients && this.state.totalPrice) {
      burgerInterface = (
        <>
          <Burger ingredients={this.state.ingredients} />
          <BuildControls
            totalPrice={this.state.totalPrice}
            addIngredientHandler={this.addIngredientHandler}
            removeIngredientHandler={this.removeIngredientHandler}
            isPurchaseable={this.state.isPurchaseable}
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

export default withErrorHandler(BurgerBuilder, axiosInstance);