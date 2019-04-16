import React, { Component } from "react";
import styles from "./ContactData.module.scss";

import { connect } from "react-redux";
import axios from "../../../axios-orders";

import Button from "../../../components/UI/Button/Button";
import Spinner from "../../../components/UI/Spinner/Spinner";
import Input from "../../../components/UI/Input/Input";

const formInputField = (elementType, type, placeholder, name, value, rules) => {
  return {
    elementType: elementType,
    elementAttributes: {
      type: type,
      placeholder: placeholder,
      name: name
    },
    value: value,
    validation: {
      isValid: false,
      rules: rules
    },
    touched: false
  };
};

class ContactData extends Component {
  state = {
    orderForm: {
      name: formInputField("input", "text", "Name", "name", "", { isRequired: true }),
      street: formInputField("input", "text", "Street", "street", "", { isRequired: true }),
      zipcode: formInputField("input", "number", "Zipcode", "zipcode", "", {
        isRequired: true,
        minLength: 5,
        maxLength: 5
      }),
      email: formInputField("input", "email", "Email", "email", "", { isRequired: true }),
      deliveryMethod: {
        elementType: "select",
        elementAttributes: {
          options: [
            { value: "regular", displayValue: "Regular" },
            { value: "expedited", displayValue: "Expedited" }
          ]
        },
        value: "regular",
        validation: {
          isValid: true,
          rules: { isRequired: true }
        }
      }
    },
    formIsValid: false,
    isLoading: false
  };

  orderHandler = (event) => {
    event.preventDefault();
    this.setState({ isLoading: true });

    const formData = {};
    for (let key in this.state.orderForm) {
      formData[key] = this.state.orderForm[key].value;
    }

    const order = {
      ingredients: this.props.ingredients,
      totalPrice: this.props.totalPrice,
      orderData: formData
    };

    console.log(order);
    axios.post("/orders.json", order)
      .then(res => {
        this.setState({ isLoading: false });
        this.props.history.replace("/");
      })
      .catch(err => this.setState({ isLoading: false }));
  };

  checkValidity = (value, rules) => {
    let isValid = true;

    if (rules.isRequired) {
      isValid = (value.trim() !== "" && isValid);
    }

    if (rules.minLength) {
      isValid = (value.length >= rules.minLength && isValid);
    }

    if (rules.maxLength) {
      isValid = (value.length <= rules.maxLength && isValid);
    }

    return isValid;
  };

  inputChangeHandler = (event, inputName) => {
    const orderForm = { ...this.state.orderForm };
    const formElement = { ...orderForm[inputName] };
    const formValidation = { ...formElement.validation };

    formElement.value = event.target.value;
    formValidation.isValid = this.checkValidity(formElement.value, formValidation.rules);
    formElement.touched = true;

    formElement.validation = formValidation;
    orderForm[inputName] = formElement;

    let formIsValid = true;
    for (let key in orderForm) {
      formIsValid = (orderForm[key].validation.isValid && formIsValid);
    }

    this.setState({ orderForm, formIsValid });
  };

  render() {
    const formElementsArray = Object.entries(this.state.orderForm).map(([inputName, data], index) => (
      <Input
        elementType={data.elementType}
        elementAttributes={data.elementAttributes}
        value={data.value}
        changeHandler={(event) => this.inputChangeHandler(event, inputName)}
        isInvalid={!data.validation.isValid}
        touched={data.touched}
        key={inputName + index}
      />
    ));

    let form = (
      <>
        <h4>Contact Data</h4>
        <form onSubmit={this.orderHandler}>
          {formElementsArray}

          <Button buttonType={"Success"} disabled={!this.state.formIsValid}>ORDER</Button>
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

const mapStateToProps = state => {
  return {
    ingredients: state.ingredients,
    totalPrice: state.totalPrice
  };
};

export default connect(mapStateToProps)(ContactData);