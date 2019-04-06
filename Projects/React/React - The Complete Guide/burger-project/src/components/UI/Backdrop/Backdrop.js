import React from "react";
import PropTypes from "prop-types";
import styles from "./Backdrop.module.scss";

const backdrop = props => (
  props.show ? <div onClick={props.closeModal} className={styles.Backdrop} /> : null
);

backdrop.propTypes = {
  closeModal: PropTypes.func,
  show: PropTypes.bool
};

export default backdrop;

