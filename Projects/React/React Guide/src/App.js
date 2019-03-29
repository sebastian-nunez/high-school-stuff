/* eslint-disable no-unused-vars */
import React, { useState } from "react";
import "./App.css";
import Person from "./Person/Person";

const app = (props) => {
  const [peopleState, setPeopleState] = useState({
    people: [
      { name: "Sebastian", age: 17 },
      { name: "Max", age: 29 },
      { name: "Manu", age: 26 }
    ]
  });

  const [otherState, setOtherState] = useState({
    otherState: "some other state"
  });

  const switchNameHandler = () => {
    setPeopleState({
      people: [
        { name: "Seb", age: 17 },
        { name: "Max", age: 29 },
        { name: "Manu", age: 26 }]
    });
  };

  return (
    <div className="App">
      <h1>React App</h1>
      <p>JSX</p>

      <button onClick={switchNameHandler}>Switch Name</button>

      <Person name={peopleState.people[0].name} age={peopleState.people[0].age} />
      <Person name={peopleState.people[1].name} age={peopleState.people[1].age}>My Hobbies: Racing</Person>
      <Person name={peopleState.people[2].name} age={peopleState.people[2].age} />
    </div>
  );

};

export default app;
