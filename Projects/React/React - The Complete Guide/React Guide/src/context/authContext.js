import React from "react";

const authContext = React.createContext({
  isAuthenticated: false,
  loginHandler: () => {},
});

export default authContext;
