import React from "react";
import styles from "./NavigationItems.module.scss";

import NavigationItem from "./NavigationItem/NavigationItem";

const navigationItems = props => (
  <ul className={styles.NavigationItems}>
    <NavigationItem
      active={true}
      href={"/"}
      alt={"MyBurger logo"}
    >
      Burger Builder
    </NavigationItem>

    <NavigationItem
      active={false}
      href={"/"}
      alt={"MyBurger logo"}
    >
      Checkout
    </NavigationItem>
  </ul>
);

export default navigationItems;