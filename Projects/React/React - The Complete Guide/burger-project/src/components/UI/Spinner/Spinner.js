import React from "react";
import styles from "./Spinner.module.css";

const spinner = (props) => (
  <div className={styles.Loader} style={{ textAlign: "center" }}>
    Loading...
  </div>
);

export default spinner;
