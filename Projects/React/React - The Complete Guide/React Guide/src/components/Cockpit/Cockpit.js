import React, { useContext, useEffect, useRef } from "react";
import AuthContext from "../../context/authContext";
import styles from "./Cockpit.module.scss";

const cockPit = (props) => {
  const toggleButtonRef = useRef(null);
  const authContext = useContext(AuthContext);

  useEffect(() => {
    toggleButtonRef.current.click();
  }, []);

  let buttonClass = "";
  if (props.showPeople) {
    buttonClass = styles.Red;
  }

  const classes = [];
  if (props.peopleLength <= 2) {
    classes.push(styles.red);
  }

  if (props.peopleLength <= 1) {
    classes.push(styles.bold);
  }

  return (
    <div className={styles.Cockpit}>
      <h1>{props.title}</h1>
      <p className={classes.join(" ")}>JSX</p>

      <button
        className={buttonClass}
        onClick={props.togglePeopleHandler}
        ref={toggleButtonRef}
      >
        Toggle People
      </button>

      <button onClick={authContext.loginHandler}>Log in</button>
    </div>
  );
};

export default React.memo(cockPit);
