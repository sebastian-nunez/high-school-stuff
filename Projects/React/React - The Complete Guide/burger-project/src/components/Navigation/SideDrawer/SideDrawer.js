import React from "react";
import styles from "./SideDrawer.module.scss";

import Logo from "../../Logo/Logo";
import NavigationItems from "../NavigationItems/NavigationItems";
import Backdrop from "../../UI/Backdrop/Backdrop";

const sideDrawer = props => {
  const sideDrawerClasses = [styles.SideDrawer, props.isOpen ? styles.Open : styles.Closed];
  return (
    <>
      <Backdrop show={props.isOpen} closeModal={props.closeSideDrawerHandler} />

      <div className={sideDrawerClasses.join(" ")}>
        <div className={styles.Logo}>
          <Logo />
        </div>

        <nav>
          <NavigationItems />
        </nav>
      </div>
    </>
  );
};

export default sideDrawer;