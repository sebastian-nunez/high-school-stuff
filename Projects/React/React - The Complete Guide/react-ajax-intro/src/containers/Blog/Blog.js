import React, { Component } from "react";
import { NavLink, Route, Switch } from "react-router-dom";
import asyncComponent from "../../hoc/asyncComponent";
import Posts from "../Posts/Posts";
import "./Blog.css";

const AsyncNewPost = asyncComponent(() => import("../NewPost/NewPost"));

class Blog extends Component {
  state = {
    isAuth: true,
  };

  render() {
    return (
      <div className={"Blog"}>
        <header>
          <nav>
            <ul>
              <li>
                <NavLink
                  exact
                  to={"/posts"}
                  activeClassName={"my-active"}
                  activeStyle={{
                    color: "#fa923f",
                    textDecoration: "underline",
                  }}
                >
                  Posts
                </NavLink>
              </li>

              <li>
                <NavLink
                  to={{
                    pathname: "/new-post",
                    hash: "#submit",
                    search: "?quick-submit=true",
                  }}
                >
                  New Post
                </NavLink>
              </li>
            </ul>
          </nav>
        </header>

        <Switch>
          {this.state.isAuth ? (
            <Route path={"/new-post"} component={AsyncNewPost} />
          ) : null}
          <Route path={"/posts"} component={Posts} />
          {/*<Redirect from={"/"} to={"/posts"} />*/}
          <Route render={() => <h1>Not Found</h1>} />
        </Switch>
      </div>
    );
  }
}

export default Blog;
