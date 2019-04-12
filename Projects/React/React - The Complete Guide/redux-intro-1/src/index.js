import ReactDOM from "react-dom";
import React from "react";
import "./index.css";

import { Provider } from "react-redux";
import { createStore, combineReducers } from "redux";

import counterReducer from "./store/reducers/counterReducer";
import resultReducer from "./store/reducers/resultReducer";

import App from "./App";
import registerServiceWorker from "./registerServiceWorker";

const rootReducer = combineReducers({
  counterReducer,
  resultReducer
});

const store = createStore(rootReducer);

ReactDOM.render(<Provider store={store}><App /></Provider>, document.getElementById("root"));
registerServiceWorker();
