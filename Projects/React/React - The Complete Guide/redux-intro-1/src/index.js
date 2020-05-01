import React from "react";
import ReactDOM from "react-dom";
import { Provider } from "react-redux";
import { combineReducers, createStore } from "redux";
import App from "./App";
import "./index.css";
import registerServiceWorker from "./registerServiceWorker";
import counterReducer from "./store/reducers/counterReducer";
import resultReducer from "./store/reducers/resultReducer";

const rootReducer = combineReducers({
  counterReducer,
  resultReducer,
});

const store = createStore(rootReducer);

ReactDOM.render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById("root")
);
registerServiceWorker();
