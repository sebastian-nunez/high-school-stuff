import React from "react";
import ReactDOM from "react-dom";
import "./index.css";

import { combineReducers, createStore } from "redux";
import { Provider } from "react-redux";

import personsReducer from "./store/reducers/personsReducer";

import App from "./App";
import registerServiceWorker from "./registerServiceWorker";

const rootReducer = combineReducers({
  personsReducer
});

const store = createStore(rootReducer);

ReactDOM.render(<Provider store={store}><App /></Provider>, document.getElementById("root"));
registerServiceWorker();
