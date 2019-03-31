import React from "react";
import styles from "./Cockpit.module.scss";

const cockPit = props => {
  let buttonClass = "";
  if (props.showPeople) {
    buttonClass = styles.Red;
  }

  const classes = [];
  if (props.people.length <= 2) {
    classes.push(styles.red);
  }

  if (props.people.length <= 1) {
    classes.push(styles.bold);
  }

  return (
    <div className={styles.Cockpit}>
      <h1>{props.title}</h1>
      <p className={classes.join(" ")}>
        JSX
      </p>

      <button
        className={buttonClass}
        onClick={props.togglePeopleHandler}>
        Toggle People
      </button>
    </div>
  );
};

export default cockPit;