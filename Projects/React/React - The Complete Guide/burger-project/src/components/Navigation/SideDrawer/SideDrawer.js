import React from "react";
import Logo from "../../Logo/Logo";
import Backdrop from "../../UI/Backdrop/Backdrop";
import NavigationItems from "../NavigationItems/NavigationItems";
import styles from "./SideDrawer.module.scss";

const sideDrawer = (props) => {
  const sideDrawerClasses = [
    styles.SideDrawer,
    props.isOpen ? styles.Open : styles.Closed,
  ];
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
