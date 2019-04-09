import React from "react";
import styles from "./Order.module.scss";

const Order = props => {
  const spanStyle = {
    textTransform: "capitalize",
    display: "inline-block",
    margin: "0 8px",
    border: "1px solid grey",
    padding: "5px"
  };

  const ingredients = Object.entries(props.ingredients).map(([key, value]) => (
    <span style={spanStyle} key={key}>{value} &ndash; {key}</span>
  ));

  return (
    <div className={styles.Order}>
      <p>Ingredients: {ingredients}</p>
      <p>Total: <strong>${props.totalPrice}</strong></p>
    </div>
  );
};

export default Order;