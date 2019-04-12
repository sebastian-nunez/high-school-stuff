import * as actionTypes from "../actionTypes";

const initialState = {
  persons: []
};

const personsReducer = (state = initialState, action) => {
  switch (action.type) {
    case actionTypes.ADD_PERSON:
      return {
        ...state,
        persons: state.persons.concat({ ...action.payload })
      };
    case actionTypes.REMOVE_PERSON:
      return {
        ...state,
        persons: state.persons.filter(person => person.id !== action.id)
      };
    default:
      return state;
  }

};

export default personsReducer;

