import React, { Component } from "react";

import Burger from "../../components/Burger/Burger";
import BuildControls from "../../components/Burger/BuildControls/BuildControls";

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
      salad: 1,
      bacon: 1,
      cheese: 1,
      meat: 1
    },
    totalPrice: 4.99,
    isPurchaseable: true
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

  render() {
    const disabledInfo = { ...this.state.ingredients };
    for (let key in disabledInfo) {
      disabledInfo[key] = (disabledInfo[key] < 1);
    }

    return (
      <>
        <Burger ingredients={this.state.ingredients} />
        <BuildControls
          totalPrice={this.state.totalPrice}
          addIngredientHandler={this.addIngredientHandler}
          removeIngredientHandler={this.removeIngredientHandler}
          isPurchaseable={this.state.isPurchaseable}
          disabledInfo={disabledInfo}
        />
      </>
    );
  }
}

export default BurgerBuilder;