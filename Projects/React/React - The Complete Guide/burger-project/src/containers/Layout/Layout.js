import React, { Component } from "react";
import SideDrawer from "../../components/Navigation/SideDrawer/SideDrawer";
import Toolbar from "../../components/Navigation/Toolbar/Toolbar";
import styles from "./Layout.module.scss";

class Layout extends Component {
  state = {
    showSideDrawer: false,
  };

  closeSideDrawerHandler = () => {
    this.setState({ showSideDrawer: false });
  };

  toggleSideDrawerHandler = () => {
    this.setState((state, props) => {
      return { showSideDrawer: !state.showSideDrawer };
    });
  };

  render() {
    return (
      <>
        <Toolbar toggleSideDrawerHandler={this.toggleSideDrawerHandler} />

        <SideDrawer
          isOpen={this.state.showSideDrawer}
          closeSideDrawerHandler={this.closeSideDrawerHandler}
        />

        <main className={styles.Content}>{this.props.children}</main>
      </>
    );
  }
}

export default Layout;
