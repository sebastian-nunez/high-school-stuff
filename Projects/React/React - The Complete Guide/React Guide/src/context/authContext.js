import React from "react";

const AuthContext = React.createContext({
  isAuthenticated: false,
  loginHandler: () => {},
});

export default AuthContext;
