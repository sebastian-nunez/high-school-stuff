import React, { Component } from "react";

import { Route } from "react-router-dom";

import CheckoutSummary from "../../components/Order/CheckoutSummary/CheckoutSummary";
import ContactData from "./ContactData/ContactData";

class Checkout extends Component {
  state = {
    ingredients: null,
    totalPrice: null
  };

  componentWillMount() {
    let ingredients = {};
    let totalPrice = 0;

    const query = new URLSearchParams(this.props.location.search);
    for (let [key, value] of query.entries()) {
      if (key === "totalPrice") {
        totalPrice = value;
      } else {
        ingredients[key] = (+value);
      }
    }

    totalPrice = (+totalPrice).toFixed(2);
    this.setState({ ingredients, totalPrice });
  }

  checkoutCancelledHandler = () => {
    this.props.history.goBack();
  };

  checkoutContinuedHandler = () => {
    this.props.history.replace("/checkout/contact-data");
  };

  render() {
    return (
      <>
        <CheckoutSummary
          ingredients={this.state.ingredients}
          checkoutCancelled={this.checkoutCancelledHandler}
          checkoutContinued={this.checkoutContinuedHandler}
        />

        <Route
          path={this.props.match.path + "/contact-data"}
          render={(props) => (
            <ContactData
              ingredients={this.state.ingredients}
              totalPrice={this.state.totalPrice}
              {...props}
            />
          )}
        />
      </>
    );
  }

}

export default Checkout;