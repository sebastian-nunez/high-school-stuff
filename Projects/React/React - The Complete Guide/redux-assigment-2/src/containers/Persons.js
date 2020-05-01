import React, { Component } from "react";
import { connect } from "react-redux";
import AddPerson from "../components/AddPerson/AddPerson";
import Person from "../components/Person/Person";
import * as actionTypes from "../store/actionTypes";

class Persons extends Component {
  render() {
    return (
      <div>
        <AddPerson personAdded={this.props.onAddPerson} />
        {this.props.persons.map((person) => (
          <Person
            key={person.id}
            name={person.name}
            age={person.age}
            clicked={() => this.props.onRemovePerson(person.id)}
          />
        ))}
      </div>
    );
  }
}

const mapStateToProps = (state) => {
  return {
    persons: state.personsReducer.persons,
  };
};

const mapDispatchToProps = (dispatch) => {
  return {
    onAddPerson: (name, age) =>
      dispatch({
        type: actionTypes.ADD_PERSON,
        payload: {
          id: Math.random(),
          name,
          age,
        },
      }),
    onRemovePerson: (id) =>
      dispatch({
        type: actionTypes.REMOVE_PERSON,
        id,
      }),
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(Persons);
