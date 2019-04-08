import React, { Component } from "react";
import "./Posts.css";

import axios from "../../axios";
import { Route } from "react-router-dom";

import Post from "../../components/Post/Post";
import FullPost from "../FullPost/FullPost";

class Posts extends Component {
  state = {
    posts: []
  };

  componentDidMount() {
    console.log(this.props);
    axios.get("/posts")
      .then(res => {
        const posts = res.data.slice(0, 4);
        const updatedPosts = posts.map(post => {
          return {
            ...post,
            author: "Max"
          };
        });

        this.setState({ posts: updatedPosts });
      })
      .catch(err => {
        console.log(err);
      });
  }

  postSelectedHandler = (postId) => {
    // this.setState({ selectedPostId: postId });

    // this.props.history.push({ pathname: "/posts/" + postId });
    this.props.history.push("/posts/" + postId);
  };

  render() {
    let posts = (
      <p style={{ textAlign: "center" }}>
        Oops, something went wrong!
      </p>
    );

    posts = this.state.posts.map(post => (
      // <Link to={"/" + post.id} key={post.id}>
      <Post
        title={post.title}
        author={post.author}
        clickHandler={() => this.postSelectedHandler(post.id)}
        key={post.id}
      />
      // </Link>
    ));

    return (
      <div>
        <section className="Posts">
          {posts}
        </section>

        <Route exact path={this.props.match.url + "/:postId"} component={FullPost} />
      </div>
    );
  }
}

export default Posts;