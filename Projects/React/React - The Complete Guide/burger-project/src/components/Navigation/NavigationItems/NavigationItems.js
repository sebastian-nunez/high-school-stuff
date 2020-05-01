import React from "react";
import NavigationItem from "./NavigationItem/NavigationItem";
import styles from "./NavigationItems.module.scss";

const navigationItems = (props) => (
  <ul className={styles.NavigationItems}>
    <NavigationItem exact href={"/"}>
      Burger Builder
    </NavigationItem>

    <NavigationItem href={"/orders"}>Orders</NavigationItem>
  </ul>
);

export default navigationItems;
