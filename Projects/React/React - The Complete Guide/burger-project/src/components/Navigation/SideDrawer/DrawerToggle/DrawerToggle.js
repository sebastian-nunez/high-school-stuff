import React from "react";
import styles from "./DrawerToggle.module.scss";

const drawerToggle = (props) => (
  <div onClick={props.toggleSideDrawer} className={styles.DrawerToggle}>
    <div />
    <div />
    <div />
  </div>
);

export default drawerToggle;
