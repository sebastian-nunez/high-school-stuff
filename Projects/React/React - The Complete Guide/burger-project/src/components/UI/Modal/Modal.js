import React, { Component } from "react";
import PropTypes from "prop-types";
import styles from "./Modal.module.scss";

import Backdrop from "../Backdrop/Backdrop";

class Modal extends Component {
  shouldComponentUpdate(nextProps, nextState) {
    return (this.props.show !== nextProps.show || this.props.children !== nextProps.children);
  }

  render() {
    return (
      <>
        <Backdrop show={this.props.show} closeModal={this.props.closeModalHandler} />

        <div
          className={styles.Modal}
          style={{
            transform: this.props.show ? "translateY(0)" : "translateY(-100vh)",
            opacity: this.props.show ? "1" : "0"
          }}
        >
          {this.props.children}
        </div>
      </>
    );
  }
};

Modal.propTypes = {
  children: PropTypes.any,
  closeModalHandler: PropTypes.func,
  show: PropTypes.bool
};

export default Modal;

