import PropTypes from "prop-types";
import React from "react";
import styles from "./Button.module.scss";

const button = props => (
  <button
    onClick={props.clickHandler}
    className={[styles.Button, styles[props.buttonType]].join(" ")}
    disabled={props.disabled}
  >
    {props.children}
  </button>
);

button.propTypes = {
  buttonType: PropTypes.string.isRequired,
  children: PropTypes.any.isRequired,
  clickHandler: PropTypes.func,
  disabled: PropTypes.bool
};

export default button;