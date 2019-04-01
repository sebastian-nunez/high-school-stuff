import React, { PureComponent } from "react";
import Person from "./Person/Person";

class People extends PureComponent {
  render() {
    return this.props.people.map((person, index) => (
      <Person
        name={person.name}
        age={person.age}
        click={() => this.props.deletePersonHandler(index)}
        change={event => this.props.changeNameHandler(event, person.id)}
        key={person.id}
      />
    ));
  }
}

export default People;