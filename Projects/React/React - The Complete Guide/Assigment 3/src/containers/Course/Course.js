import React, { Component } from "react";

class Course extends Component {
  state = {
    courseTitle: "",
  };

  componentDidMount() {
    const courseTitle = this.parseQueryParam("courseTitle");
    this.setState({ courseTitle });
  }

  componentDidUpdate() {
    const courseTitle = this.parseQueryParam("courseTitle");
    if (this.state.courseTitle !== courseTitle) {
      this.setState({ courseTitle });
    }
  }

  parseQueryParam = (queryParam) => {
    let parsedOutput = "Not Found";

    const query = new URLSearchParams(this.props.location.search);
    for (const param of query.entries()) {
      if (param[0] === queryParam) {
        parsedOutput = param[1];
        break;
      }
    }

    return parsedOutput;
  };

  render() {
    return (
      <div>
        <h1>{this.state.courseTitle ? this.state.courseTitle : null}</h1>
        <p>
          You selected the Course with ID: {this.props.match.params.courseId}
        </p>
      </div>
    );
  }
}

export default Course;
