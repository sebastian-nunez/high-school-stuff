import React from "react";
import ReactDOM from "react-dom";
import "./index.css";

import axios from "axios";

import App from "./App";
import registerServiceWorker from "./registerServiceWorker";

axios.defaults.baseURL = "https://jsonplaceholder.typicode.com";
axios.defaults.headers.common["Authorization"] = "AUTH TOKEN";
axios.defaults.headers.post["Content-Type"] = "application/json";

const reqInt = axios.interceptors.request.use(requestConfig => {
  console.log(requestConfig);
  return requestConfig;
}, error => {
  console.log(error);
  return Promise.reject(error);
});

const resInt = axios.interceptors.response.use(response => {
  console.log(response);
  return response;
}, error => {
  console.log(error);
  return Promise.reject(error);
});

axios.interceptors.request.eject(reqInt);
axios.interceptors.response.eject(resInt);

ReactDOM.render(<App />, document.getElementById("root"));
registerServiceWorker();
