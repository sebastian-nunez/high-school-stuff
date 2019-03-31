import React, { Component } from "react";
import styles from "./App.module.scss";

import People from "../components/People/People";
import Cockpit from "../components/Cockpit/Cockpit";

class App extends Component {
  state = {
    people: [
      { id: 213, name: "Max", age: 28 },
      { id: 435, name: "Manu", age: 29 },
      { id: 954, name: "Stephanie", age: 26 }
    ],
    otherState: "some other state",
    showPeople: false
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

    this.setState({ people });
  };

  togglePeopleHandler = () => {
    const doesShow = this.state.showPeople;

    this.setState({
      showPeople: !doesShow
    });
  };

  render() {
    let people = null;
    if (this.state.showPeople) {
      people = <People
        people={this.state.people}
        deletePersonHandler={this.deletePersonHandler}
        changeNameHandler={this.changeNameHandler}
      />;
    }

    return (
      <div className={styles.App}>
        <Cockpit
          title={this.props.appTitle}
          people={this.state.people}
          showPeople={this.state.showPeople}
          togglePeopleHandler={this.togglePeopleHandler}
        />

        {people}
      </div>
    );
  }
}

export default App;
