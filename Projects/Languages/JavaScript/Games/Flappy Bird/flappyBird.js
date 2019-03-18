window.onload = function start() {
  //sets up the canvas and context
  const cvs = document.getElementById("canvas");
  const ctx = cvs.getContext("2d");

  //some variables to make location easier
  var cvsH = cvs.height;
  var cvsW = cvs.width;

  //bird declaration
  var bird;

  //pipe array declaration
  var pipes = [];

  //sets up the constant gap between the top and bottom pipe
  const gap = 128;

  //keeps track of the score
  var score = 0;

  //determines if the spacebar is pressed
  document.addEventListener("keydown", function keyPressed(e) {
    if (e.keyCode == 32) {
      bird.up();
    }
  });
  const add = () => {
    () => {

    }
  }

  //bird constructor
  function Bird() {
    //starting coordinates of the bird
    this.x = 64;
    this.y = cvsH / 2;

    //size of the bird
    this.w = 32;
    this.h = 32;

    //forces
    this.gravity = 1.2;
    this.lift = -16;
    this.velocity = 0;

    //shows the bird
    this.show = function () {
      ctx.fillStyle = "#FFF";
      ctx.fillRect(this.x, this.y, this.w, this.h);
    };

    //acts to counter the gravitational force (ie. elevate the bird)
    this.up = function () {
      this.velocity += this.lift;
    };

    //uses gravity & velocity to move the bird
    this.update = function () {
      this.velocity += this.gravity;
      this.velocity *= 0.92;
      this.y += this.velocity;
    };
  }

  //pipe constructor
  function Pipe() {
    //generates a random number between 32 and 440 (this will the height of the top pipe)
    this.top = Math.floor(Math.random() * (440 - 32 + 1)) + 32;
    this.bottom = this.top + gap;
    this.w = 20;
    this.x = cvsW;

    this.speed = 3.5;

    this.hits = function (bird) {
      if (
        (bird.x + bird.w >= this.x &&
          bird.x <= this.x + this.w &&
          (bird.y <= this.top || bird.y + bird.h >= this.bottom)) ||
        bird.y + bird.h >= cvsH
      ) {
        return true;
      }
      return false;
    };

    //this.x < bird.x+bird.w && (bird.y > this.bottom || bird.y < this.top)

    //draws the top then bottom pipes
    this.show = function () {
      ctx.fillStyle = "#FFF";
      ctx.fillRect(this.x, 0, this.w, this.top);
      ctx.fillRect(this.x, this.bottom, this.w, 568);
    };

    //moves the pipes to the right
    this.update = function () {
      this.x -= this.speed;
    };

    //checks to see when the 'old' pipes are off the screen
    this.offScreen = function () {
      if (this.x < -this.w) {
        return true;
      } else {
        return false;
      }
    };
  }

  //only called ONCE
  function setUp() {
    bird = new Bird();
    pipes.push(new Pipe());
  }

  //every 30ms frameCount should increase
  let frameCount = 0;

  //sets the initial rate of pipe generation
  let pipeRate = 75;

  //main draw function
  function draw() {
    //clears the board
    ctx.clearRect(0, 0, cvsW, cvsH);

    //keeps track of 'FPS'
    frameCount++;

    //draws pipes (and deletes the one's off the screen)
    for (let i = pipes.length - 1; i >= 0; i--) {
      pipes[i].show();
      pipes[i].update();
      if (pipes[i].offScreen()) {
        pipes.splice(i, 1);
      }
      //determines if the bird hits the pipe (or ground) and reloads the page
      if (pipes[i].hits(bird)) {
        location.reload();
      }
      //determines if the player has crossed the pipe and adds 1 to the score
      if (pipes[i].x == bird.x && bird.y < pipes[i].bottom && bird.y > pipes[i].top) {
        score++;
      }
    }

    //whenever the the remainder of frameCount is 0 (when divided by the pipeRate) a new pipe is generated
    if (frameCount % pipeRate == 0) {
      pipes.push(new Pipe());
    }

    //bird movement
    bird.update();
    bird.show();

    ctx.fillStyle = "#FF0";
    ctx.font = "16px Verdana";
    ctx.fillText("Score: " + score, 16, 24);
  }

  //function call (only once)
  setUp();

  //updates the board every 30ms
  setInterval(draw, 30);
};
