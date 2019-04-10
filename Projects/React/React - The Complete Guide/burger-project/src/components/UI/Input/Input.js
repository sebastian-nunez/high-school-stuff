import React from "react";
import styles from "./Input.module.scss";

const input = props => {
  const inputClasses = [styles.InputElement];
  if (props.isInvalid && props.touched) {
    inputClasses.push(styles.Invalid);
  }

  let inputElement = null;
  switch (props.elementType) {
    case "input":
      inputElement = (
        <input
          className={inputClasses.join(" ")}
          {...props.elementAttributes}
          value={props.value}
          onChange={props.changeHandler}
        />
      );
      break;
    case "textarea":
      inputElement = (
        <textarea
          className={inputClasses.join(" ")}
          {...props.elementAttributes}
          value={props.value}
          onChange={props.changeHandler}
        />
      );
      break;
    case "select":
      inputElement = (
        <select
          className={styles.InputElement}
          value={props.value}
          onChange={props.changeHandler}
        >
          {props.elementAttributes.options.map((option, index) => (
            <option value={option.value} key={option + index}>
              {option.displayValue}
            </option>
          ))}
        </select>
      );
      break;
    default:
      inputElement = (
        <input
          className={inputClasses.join(" ")}
          {...props.elementAttributes}
          value={props.value}
          onChange={props.changeHandler}
        />
      );
      break;
  }

  let validationError = null;
  if (props.isInvalid && props.touched) {
    validationError = <p className={styles.ValidationError}>Please enter a valid value!</p>;
  }

  return (
    <div className={styles.Input}>
      <label className={styles.Label}>{props.label}</label>
      {inputElement}
      {validationError}
    </div>
  );
};

export default input;