/* eslint-disable no-unused-vars */
import React, { useState } from "react";
import "./App.scss";
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

  const switchNameHandler = (name) => {
    setPeopleState({
      people: [
        { name: name, age: 17 },
        { name: "Max", age: 29 },
        { name: "Manu", age: 26 }]
    });
  };

  const nameChangedHandler = (event) => {
    setPeopleState({
      people: [
        { name: "Sebastian", age: 17 },
        { name: event.target.value, age: 29 },
        { name: "Manu", age: 26 }
      ]
    });
  };

  const style = {
    backgroundColor: "white",
    font: "inherit",
    border: "1px solid blue",
    padding: "8px",
    cursor: "pointer"
  };

  return (
    <div className="App">
      <h1>React App</h1>
      <p>JSX</p>

      <button
        onClick={() => switchNameHandler("Seb")}
        style={style}>
        Switch Name
      </button>

      <Person
        name={peopleState.people[0].name}
        age={peopleState.people[0].age}
        click={switchNameHandler.bind(this, "Seb!")}
      />

      <Person
        name={peopleState.people[1].name}
        age={peopleState.people[1].age}
        changed={nameChangedHandler}>
        My Hobbies: Racing
      </Person>

      <Person
        name={peopleState.people[2].name}
        age={peopleState.people[2].age}
      />
    </div>
  );
};

export default app;
