import React, { Component } from "react";
import "./Posts.css";

import { Route } from "react-router-dom";

import axios from "../../axios";

import Post from "../../components/Post/Post";

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
    this.setState({ selectedPostId: postId });
  };

  render() {
    let posts = (
      <p style={{ textAlign: "center" }}>
        Oops, something went wrong!
      </p>
    );

    if (!this.state.hasError) {
      posts = this.state.posts.map(post => (
        <Post
          title={post.title}
          author={post.author}
          clickHandler={() => this.postSelectedHandler(post.id)}
          key={post.id}
        />
      ));
    }

    return (
      <section className="Posts">
        {posts}
      </section>

    );
  }
}

export default Posts;