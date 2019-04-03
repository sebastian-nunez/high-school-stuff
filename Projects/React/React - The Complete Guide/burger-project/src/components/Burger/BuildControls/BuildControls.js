import React from "react";
import styles from "./BuildControls.module.scss";

import BuildControl from "./BuildControl/BuildControl";

const controls = [
  { label: "Salad", type: "salad" },
  { label: "Bacon", type: "bacon" },
  { label: "Cheese", type: "cheese" },
  { label: "Meat", type: "meat" }
];

const buildControls = props => (
  <div className={styles.BuildControls}>
    <p>Current Price: <strong>{props.totalPrice.toFixed(2)}</strong></p>

    {controls.map(control =>
      <BuildControl
        ingredientLabel={control.label}
        type={control.type}
        addIngredientHandler={props.addIngredientHandler}
        removeIngredientHandler={props.removeIngredientHandler}
        isDisabled={props.disabledInfo[control.type]}
        key={control.label}
      />
    )}

    <button className={styles.OrderButton} disabled={!props.isPurchaseable}>ORDER NOW</button>
  </div>
);

export default buildControls;