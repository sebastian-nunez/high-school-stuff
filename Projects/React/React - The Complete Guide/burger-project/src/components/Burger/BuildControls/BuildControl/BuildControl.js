import React from "react";
import styles from "./BuildControl.module.scss";

const buildControl = (props) => (
  <div className={styles.BuildControl}>
    <div className={styles.Label}>{props.ingredientLabel}</div>

    <button
      className={styles.More}
      onClick={() => props.addIngredientHandler(props.type)}
    >
      More
    </button>

    <button
      className={styles.Less}
      onClick={() => props.removeIngredientHandler(props.type)}
      disabled={props.isDisabled}
    >
      Less
    </button>
  </div>
);

export default buildControl;
