import React, { Component } from "react";
import "./App.css";
import Person from "./Person/Person";

class App extends Component {
  render() {
    return (
      <div className="App">
        <h1>React App</h1>
        <p>JSX</p>
        <Person name={"Sebastian"} age={"28"} />
        <Person name={"Max"} age={"29"} />
        <Person name={"Manu"} age={"26"} />
      </div>
    );
    // return React.createElement("div", {className: "App"}, React.createElement("h1", null, "Hi I'm a React App!"));
  }
}

export default App;
