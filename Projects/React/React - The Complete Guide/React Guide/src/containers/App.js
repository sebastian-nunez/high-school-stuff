import React, { Component } from "react";
import styles from "./App.module.scss";

import People from "../components/People/People";
import Cockpit from "../components/Cockpit/Cockpit";
import withClass from "../hoc/withClass";
import AuthContext from "../context/authContext";

class App extends Component {
  state = {
    people: [
      { id: 213, name: "Max", age: 28 },
      { id: 435, name: "Manu", age: 29 },
      { id: 954, name: "Stephanie", age: 26 }
    ],
    otherState: "some other state",
    showPeople: false,
    showCockpit: true,
    changeCounter: 0,
    isAuthenticated: false
  };

  deletePersonHandler = (personIndex) => {
    const people = [...this.state.people];
    people.splice(personIndex, 1);
    this.setState({ people });
  };

  changeNameHandler = (event, id) => {
    const personIndex = this.state.people.findIndex(person => person.id === id);

    const person = { ...this.state.people[personIndex] };
    person.name = event.target.value;

    const people = [...this.state.people];
    people[personIndex] = person;

    this.setState((prevState, props) => {
      return {
        people,
        changeCounter: prevState.changeCounter + 1
      };
    });
  };

  togglePeopleHandler = () => {
    this.setState((prevState, props) => {
      return { showPeople: !prevState.showPeople };
    });
  };

  loginHandler = () => {
    this.setState({
      isAuthenticated: true
    });
  };

  render() {
    let people = null;
    if (this.state.showPeople) {
      people = (
        <People
          people={this.state.people}
          deletePersonHandler={this.deletePersonHandler}
          changeNameHandler={this.changeNameHandler}
          isAuthenticated={this.state.isAuthenticated}
        />
      );
    }

    return (
      <>
        <button
          style={{ backgroundColor: "red" }}
          onClick={() => this.setState({ showCockpit: false })}>
          Remove Cockpit
        </button>

        <AuthContext.Provider
          value={{
            isAuthenticated: this.state.isAuthenticated,
            loginHandler: this.loginHandler
          }}>
          {this.state.showCockpit ?
            <Cockpit
              title={this.props.appTitle}
              peopleLength={this.state.people.length}
              showPeople={this.state.showPeople}
              togglePeopleHandler={this.togglePeopleHandler}
            /> : null
          }

          {people}
        </AuthContext.Provider>
      </>
    );
  }
}

export default withClass(App, styles.App);
