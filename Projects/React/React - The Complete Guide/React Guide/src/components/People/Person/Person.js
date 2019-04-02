import React, { Component } from "react";
import PropTypes from "prop-types";
import styles from "./Person.module.scss";

import withClass from "../../../hoc/withClass";
import AuthContext from "../../../Context/authContext";

class Person extends Component {
  constructor(props) {
    super(props);
    this.inputElementRef = React.createRef();
  }

  static contextType = AuthContext;

  componentDidMount() {
    if (this.props.shouldInputFocus) {
      this.inputElementRef.current.focus();
    }
  }

  render() {
    let shouldFocusRef = null;
    if (this.props.shouldInputFocus) {
      shouldFocusRef = this.inputElementRef;
    }

    return (
      <>
        {this.context.isAuthenticated ?
          <p>Authenticated!</p>
          :
          <p>Please log in</p>
        }

        <p onClick={this.props.deletePersonHandler}>
          My name is {this.props.name} and I am {this.props.age} years old!
        </p>

        <p>{this.props.children}</p>

        <input
          type="text"
          onChange={this.props.changeNameHandler}
          value={this.props.name}
          ref={shouldFocusRef}
        />
      </>
    );
  }
};

Person.propTypes = {
  deletePersonHandler: PropTypes.func,
  name: PropTypes.string,
  age: PropTypes.number,
  changeNameHandler: PropTypes.func,
  shouldInputFocus: PropTypes.bool
};

export default withClass(Person, styles.Person);