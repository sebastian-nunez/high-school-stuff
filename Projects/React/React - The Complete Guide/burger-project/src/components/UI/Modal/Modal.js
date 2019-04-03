import React from "react";
import styles from "./Modal.module.scss";

import Backdrop from "../Backdrop/Backdrop";

const modal = props => (
  <>
    <Backdrop isPurchasing={props.isPurchasing} closeModal={props.purchaseCancelHandler} />

    <div
      className={styles.Modal}
      style={{
        transform: props.isPurchasing ? "translateY(0)" : "translateY(-100vh)",
        opacity: props.isPurchasing ? "1" : "0"
      }}>
      {props.children}
    </div>
  </>
);

export default modal;