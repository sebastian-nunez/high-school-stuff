import React from "react";
import styles from "./Toolbar.module.scss";

import Logo from "../../Logo/Logo";
import NavigationItems from "../NavigationItems/NavigationItems";
import SideDrawer from "../SideDrawer/SideDrawer";
import DrawerToggle from "../SideDrawer/DrawerToggle/DrawerToggle";

const toolbar = props => (
  <header className={styles.Toolbar}>
    <DrawerToggle toggleSideDrawer={props.toggleSideDrawerHandler} />

    <SideDrawer />

    <div className={styles.Logo}>
      <Logo />
    </div>

    <nav className={styles.DesktopOnly}>
      <NavigationItems />
    </nav>
  </header>
);

export default toolbar;