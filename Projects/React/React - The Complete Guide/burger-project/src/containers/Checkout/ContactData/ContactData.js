import React, { Component } from "react";
import styles from "./ContactData.module.scss";

import axios from "../../../axios-orders";

import Button from "../../../components/UI/Button/Button";
import Spinner from "../../../components/UI/Spinner/Spinner";

class ContactData extends Component {
  state = {
    name: "",
    email: "",
    adress: {
      street: "",
      zipcode: ""
    },
    isLoading: false
  };

  orderHandler = (event) => {
    event.preventDefault();

    this.setState({ isLoading: true });

    const order = {
      ingredients: this.props.ingredients,
      totalPrice: this.props.totalPrice,
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

    console.log(order);

    axios.post("/orders.json", order)
      .then(res => {
        this.setState({ isLoading: false });
        this.props.history.replace("/");
      })
      .catch(err => this.setState({ isLoading: false }));
  };

  render() {
    let form = (
      <>
        <h4>Contact Data</h4>
        <form>
          <input className={styles.Input} type="text" name={"name"} placeholder={"Name"} />
          <input className={styles.Input} type="email" name={"email"} placeholder={"Email"} />
          <input className={styles.Input} type="text" name={"street"} placeholder={"Street Adress"} />
          <input className={styles.Input} type="text" name={"zipcode"} placeholder={"Zipcode"} />

          <Button clickHandler={this.orderHandler} buttonType={"Success"}>ORDER</Button>
        </form>
      </>
    );

    if (this.state.isLoading) {
      form = <Spinner />;
    }

    return (
      <div className={styles.ContactData}>
        {form}
      </div>
    );
  }
}

export default ContactData;