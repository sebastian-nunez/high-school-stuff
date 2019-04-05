import React, { Component } from "react";

import axiosInstance from "../../axios-orders";

import Burger from "../../components/Burger/Burger";
import BuildControls from "../../components/Burger/BuildControls/BuildControls";
import Modal from "../../components/UI/Modal/Modal";
import OrderSummary from "../../components/Burger/OrderSummary/OrderSummary";
import Spinner from "../../components/UI/Spinner/Spinner";

const INGREDIENT_PRICES = {
  salad: 0.15,
  cheese: 0.2,
  bacon: 0.5,
  meat: 2.95,
  base: 1.19
};

class BurgerBuilder extends Component {
  state = {
    ingredients: {
      salad: 0,
      bacon: 0,
      cheese: 0,
      meat: 0
    },
    totalPrice: INGREDIENT_PRICES.base,
    isPurchaseable: false,
    isPurchasing: false,
    isLoading: false
  };

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
      }, () => this.setState({ isPurchaseable: (this.state.totalPrice > INGREDIENT_PRICES.base + 0.01) })
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
        const newTotal = oldTotal < INGREDIENT_PRICES.base ? INGREDIENT_PRICES.base : oldTotal - priceDeduction;

        return {
          ingredients: updatedIngredients,
          totalPrice: newTotal
        };
      }, () => this.setState({ isPurchaseable: (this.state.totalPrice > INGREDIENT_PRICES.base + 0.01) })
    );
  };

  // updatePurchaseState = (ingredients) => {
  //   let sum = 0;
  //   for (let key in ingredients) {
  //     sum += ingredients[key] * INGREDIENT_PRICES[key];
  //   }
  //
  //   sum += INGREDIENT_PRICES.base;
  //
  //   this.setState({ isPurchaseable: (sum > INGREDIENT_PRICES.base + 0.01) });
  // };

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
      totalPrice: this.state.totalPrice,
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

    return (
      <>
        <Modal
          show={this.state.isPurchasing}
          purchaseCancelHandler={this.purchaseCancelHandler}
        >
          {!this.state.isLoading ? <OrderSummary
              ingredients={this.state.ingredients}
              totalPrice={this.state.totalPrice}
              purchaseCancelHandler={this.purchaseCancelHandler}
              purchaseContinueHandler={this.purchaseContinueHandler}
            />
            : <Spinner />
          }
        </Modal>

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
}

export default BurgerBuilder;

