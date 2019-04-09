import React from "react";
import styles from "./NavigationItems.module.scss";

import NavigationItem from "./NavigationItem/NavigationItem";

const navigationItems = props => (
  <ul className={styles.NavigationItems}>
    <NavigationItem
      exact
      href={"/"}
    >
      Burger Builder
    </NavigationItem>

    <NavigationItem
      href={"/orders"}
    >
      Orders
    </NavigationItem>
  </ul>
);

export default navigationItems;