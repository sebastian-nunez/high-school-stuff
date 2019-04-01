import React, { Component } from "react";
import PropTypes from "prop-types";
import styles from "./Person.module.scss";

import withClass from "../../../hoc/withClass/withClass";

class Person extends Component {
  constructor(props) {
    super(props);
    this.inputElementRef = React.createRef();
  }

  componentDidMount() {
    this.inputElementRef.current.focus();
  }

  render() {
    return (
      <>
        <p onClick={this.props.deletePersonHandler}>
          My name is {this.props.name} and I am {this.props.age} years old!
        </p>

        <p>{this.props.children}</p>

        <input
          type="text"
          onChange={this.props.changeNameHandler}
          value={this.props.name}
          ref={this.inputElementRef}
        />
      </>
    );
  }
};

Person.propTypes = {
  deletePersonHandler: PropTypes.func,
  name: PropTypes.string,
  age: PropTypes.number,
  changeNameHandler: PropTypes.func
};

export default withClass(Person, styles.Person);