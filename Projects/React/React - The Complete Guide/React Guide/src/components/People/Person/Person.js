import React from "react";
import styles from "./Person.module.scss";

import withClass from "../../../hoc/withClass/withClass";

const person = props => {
  return (
    <>
      <p onClick={props.click}>
        My name is {props.name} and I am {props.age} years old!
      </p>

      <p>{props.children}</p>

      <input type="text" onChange={props.change} value={props.name} />
    </>
  );
};

export default withClass(person, styles.Person);