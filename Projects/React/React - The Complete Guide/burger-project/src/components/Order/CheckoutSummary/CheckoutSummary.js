import PropTypes from "prop-types";
import React from "react";
import Burger from "../../Burger/Burger";
import Button from "../../UI/Button/Button";
import styles from "./CheckoutSummary.module.scss";

const checkoutSummary = (props) => {
  return (
    <div className={styles.CheckoutSummary}>
      <h1>We hope it tastes well!</h1>

      <div style={{ width: "100%", margin: "auto" }}>
        <Burger ingredients={props.ingredients} />
      </div>

      <Button clickHandler={props.checkoutCancelled} buttonType={"Danger"}>
        CANCEL
      </Button>
      <Button clickHandler={props.checkoutContinued} buttonType={"Success"}>
        CONTINUE
      </Button>
    </div>
  );
};

checkoutSummary.propTypes = {
  ingredients: PropTypes.object.isRequired,
};

export default checkoutSummary;
