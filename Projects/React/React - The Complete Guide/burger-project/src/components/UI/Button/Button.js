import React from "react";
import PropTypes from "prop-types";
import styles from "./Button.module.scss";

const button = props => (
  <button
    onClick={props.clickHandler}
    className={[styles.Button, styles[props.buttonType]].join(" ")}
  >
    {props.children}
  </button>
);

button.propTypes = {
  clickHandler: PropTypes.func.isRequired,
  buttonType: PropTypes.string.isRequired
};

export default button;