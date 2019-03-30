import React, { Component } from "react";
import "./App.css";
import Validation from "./Validation/Validation";
import Char from "./Char/Char";

class App extends Component {
  state = {
    input: ""
  };

  textInputHandler = input => {
    this.setState({
      input
    });
  };

  deleteCharHandler = (index) => {
    const text = this.state.input.split("");
    text.splice(index, 1);

    this.setState({
      input: text.join("")
    });
  };

  render() {
    const charArray = this.state.input.split("").map((char, index) => {
      return <Char
        character={char}
        click={() => this.deleteCharHandler(index)}
        key={index}
      />;
    });

    return (
      <div className="App">
        <input type="text" onChange={(event) => this.textInputHandler(event.target.value)} />
        <p>Length: {this.state.input.length}</p>

        <Validation inputLength={this.state.input.length} />

        {charArray}
      </div>
    );
  }
}

export default App;
