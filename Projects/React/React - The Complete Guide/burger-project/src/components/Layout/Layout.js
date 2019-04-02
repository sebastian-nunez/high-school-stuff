import React from "react";

const layOut = props => (
  <>
    <div>Toolbar, SideDrawer, Backdrop</div>

    <main>
      {props.children}
    </main>
  </>
);

export default layOut;