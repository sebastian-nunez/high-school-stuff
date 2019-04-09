import React, { Component } from "react";

import axios from "../../axios-orders";

import Order from "../../components/Order/Order";
import withErrorHandler from "../../hoc/withErrorHandler/withErrorHandler";

class Orders extends Component {
  state = {
    orders: [],
    isLoading: true
  };

  componentDidMount() {
    axios.get("/orders.json")
      .then(res => {
        const orders = [];
        for (let key in res.data) {
          orders.push({
            ...res.data[key],
            id: key
          });
        }

        this.setState({ isLoading: false, orders });
      })
      .catch(err => {
        this.setState({ isLoading: false });
        console.log(err);
      });
  }

  render() {
    let orders = this.state.orders.map(order => (
      <Order
        ingredients={order.ingredients}
        totalPrice={order.totalPrice}
        key={order.id}
      />
    ));

    if (orders.length === 0) {
      orders = <h2 style={{ textAlign: "center" }}>You have no orders!</h2>;
    }

    return (
      <div>
        {orders}
      </div>
    );
  }
}

export default withErrorHandler(Orders, axios);