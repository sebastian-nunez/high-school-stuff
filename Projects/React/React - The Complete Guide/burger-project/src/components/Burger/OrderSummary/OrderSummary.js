import React from "react";

import Button from "../../UI/Button/Button";

const orderSummary = props => {
  const ingredientSummary = Object.keys(props.ingredients)
    .map(item =>
      <li key={item}>
        <span style={{ textTransform: "capitalize" }}>{item}</span>: {props.ingredients[item]}
      </li>
    );

  return (
    <>
      <h3>Your Order</h3>
      <p>A delicious burger with the following ingredients:</p>

      <ul>
        {ingredientSummary}
      </ul>
      <p>
        <span style={{ fontWeight: "bold" }}>Total Price: ${props.totalPrice.toFixed(2)}</span>
      </p>

      <p>Continue to checkout?</p>
      <Button
        clickHandler={props.purchaseCancelHandler}
        buttonType={"Danger"}
      >
        CANCEL
      </Button>

      <Button
        clickHandler={props.purchaseContinueHandler}
        buttonType={"Success"}
      >
        CONTINUE
      </Button>
    </>
  );

};

export default orderSummary;