import React, { Component } from "react";
import styles from "./App.module.scss";
import Person from "../components/People/Person/Person";

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
    let buttonClass = "";

    if (this.state.showPeople) {
      people = (
        <div>
          {
            this.state.people.map((person, index) => {
              return <Person
                name={person.name}
                age={person.age}
                click={() => this.deletePersonHandler(index)}
                change={(event) => this.changeNameHandler(event, person.id)}
                key={person.id}
              />;
            })
          }
        </div>
      );

      buttonClass = styles.Red;
    }

    const classes = [];
    if (this.state.people.length <= 2) {
      classes.push(styles.red);
    }

    if (this.state.people.length <= 1) {
      classes.push(styles.bold);
    }

    return (
      <div className={styles.App}>
        <h1>React App</h1>
        <p className={classes.join(" ")}>
          JSX
        </p>

        <button
          className={buttonClass}
          onClick={this.togglePeopleHandler}>
          Toggle People
        </button>

        {people}
      </div>
    );
  }
}

export default App;

// export default app;import React, { useState } from "react";
// import "./App.module.scss";
// import Person from "./Person/Person";
//
// const app = (props) => {
//   const [peopleState, setPeopleState] = useState({
//     people: [
//       { name: "Sebastian", age: 17 },
//       { name: "Max", age: 29 },
//       { name: "Manu", age: 26 }
//     ]
//   });
//
//   const [otherState, setOtherState] = useState({
//     otherState: "some other state"
//   });
//
//   const switchNameHandler = (name) => {
//     setPeopleState({
//       people: [
//         { name: name, age: 17 },
//         { name: "Max", age: 29 },
//         { name: "Manu", age: 26 }]
//     });
//   };
//
//   const changeNameHandler = (event) => {
//     setPeopleState({
//       people: [
//         { name: "Sebastian", age: 17 },
//         { name: event.target.value, age: 29 },
//         { name: "Manu", age: 26 }
//       ]
//     });
//   };
//
//   const style = {
//     backgroundColor: "white",
//     font: "inherit",
//     border: "1px solid blue",
//     padding: "8px",
//     cursor: "pointer"
//   };
//
//   return (
//     <div className="App">
//       <h1>React App</h1>
//       <p>JSX</p>
//
//       <button
//         onClick={() => switchNameHandler("Seb")}
//         style={style}>
//         Switch Name
//       </button>
//
//       <Person
//         name={peopleState.people[0].name}
//         age={peopleState.people[0].age}
//         click={switchNameHandler.bind(this, "Seb!")}
//       />
//
//       <Person
//         name={peopleState.people[1].name}
//         age={peopleState.people[1].age}
//         changed={changeNameHandler}>
//         My Hobbies: Racing
//       </Person>
//
//       <Person
//         name={peopleState.people[2].name}
//         age={peopleState.people[2].age}
//       />
//     </div>
//   );
// };
//
// export default app;
