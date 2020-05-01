import PropTypes from "prop-types";
import React from "react";
import { NavLink } from "react-router-dom";
import styles from "./NavigationItem.module.scss";

const navigationItem = (props) => (
  <li className={styles.NavigationItem}>
    <NavLink
      exact={props.exact}
      to={props.href}
      activeClassName={styles.Active}
    >
      {props.children}
    </NavLink>
  </li>
);

navigationItem.propTypes = {
  href: PropTypes.string.isRequired,
  children: PropTypes.string.isRequired,
};

export default navigationItem;
