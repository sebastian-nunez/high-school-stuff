import React from "react";

const withClass = (Component, classes) => {
  return (props) => (
    <div className={classes}>
      <Component {...props} />
    </div>
  );
};

export default withClass;

// const withClass = props => (
//   <div className={props.classes}>
//     {props.children}
//   </div>
// );
//
// export default withClass;
