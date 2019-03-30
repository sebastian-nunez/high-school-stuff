import React from "react";
import Person from "./Person/Person";

const people = props => props.people.map((person, index) => {
  return <Person
    name={person.name}
    age={person.age}
    click={() => props.deletePersonHandler(index)}
    change={event => props.changeNameHandler(event, person.id)}
    key={person.id}
  />;
});

export default people;