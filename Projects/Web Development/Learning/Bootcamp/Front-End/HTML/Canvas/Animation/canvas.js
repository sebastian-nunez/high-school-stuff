window.onload = function() {
  let canvas = document.getElementById("canvas");
  canvas.width = 500;
  canvas.height = 500;

  let context = canvas.getContext("2d");

  // initial positions
  let x = 250;
  let y = 250;

  // radius of circle
  let radius = 30;

  // velocities
  let xVelocity = 1;
  let yVelocity = 2;

  // gravity
  let gravity = 0.85;

  // drag
  let drag = 0.93;

  function animate() {
    // @important clears canvas by drawing a big white rectangle over the old canvas
    context.clearRect(0, 0, canvas.width, canvas.height);

    // draws circle
    context.beginPath();
    context.strokeStyle = "blue";
    context.arc(
      x,
      y,
      radius,
      (Math.PI / 180) * 0,
      (Math.PI / 180) * 360,
      true
    );
    context.stroke();

    // update velocity and checks if circle is out of bounds
    if (x > canvas.width - radius || x - radius < 0) {
      xVelocity = -xVelocity;
    }

    if (y + radius > canvas.height || y < radius) {
      yVelocity = -yVelocity;
    }

    // sets the objects motion
    x += xVelocity * drag;
    y += yVelocity * gravity;
  }

  // refreshes the page every 1ms
  setInterval(animate, 1);
};
