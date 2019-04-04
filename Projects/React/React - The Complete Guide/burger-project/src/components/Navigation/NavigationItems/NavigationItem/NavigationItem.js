import React from "react";
import PropTypes from "prop-types";
import styles from "./NavigationItem.module.scss";

const navigationItem = props => (
  <li className={styles.NavigationItem}>
    <a
      className={props.active ? styles.Active : null}
      href={props.href}
      alt={props.alt}
    >
      {props.children}
    </a>
  </li>
);

navigationItem.propTypes = {
  href: PropTypes.string.isRequired,
  alt: PropTypes.string.isRequired,
  active: PropTypes.bool.isRequired,
  children: PropTypes.string.isRequired
};

export default navigationItem;