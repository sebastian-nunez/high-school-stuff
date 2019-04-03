import React from "react";
import styles from "./Backdrop.module.scss";

const backdrop = props => (
  props.isPurchasing ? <div onClick={props.closeModal} className={styles.Backdrop} /> : null
);

export default backdrop;