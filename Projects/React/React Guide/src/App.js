import React, { useState } from "react";
import "./App.css";
import Person from "./Person/Person";

const app = () => {
  const [personsState, setPersonsState] = useState({
    persons: [
      { name: "Sebastian", age: 17 },
      { name: "Max", age: 29 },
      { name: "Manu", age: 26 }
    ]
  });

  return (
    <div className="App">
      <h1>React App</h1>
      <p>JSX</p>

      <button onClick={this.switchNameHandler}>Switch Name</button>

      <Person name={this.state.persons[0].name} age={this.state.persons[0].age} />
      <Person name={this.state.persons[1].name} age={this.state.persons[1].age}>My Hobbies: Racing</Person>
      <Person name={this.state.persons[2].name} age={this.state.persons[2].age} />
    </div>
  );

  // return React.createElement("div", {className: "App"}, React.createElement("h1", null, "Hi I'm a React App!"));
};

export default app;

// state = {
//   persons: [
//     { name: "Sebastian", age: 17 },
//     { name: "Max", age: 29 },
//     { name: "Manu", age: 26 }
//   ]
// };
//
// switchNameHandler = () => {
//   // console.log("Was clicked!");
//   // DON'T: this.state.persons[0].name = "Seb";
//   this.setState({
//     persons: [
//       { name: "Seb", age: 17 },
//       { name: "Max", age: 29 },
//       { name: "Manu", age: 26 }]
//   });
// };