window.onload = function () {
  // sets up the canvas dimensions (full width and height of window)
  let canvas = document.getElementById("canvas");
  canvas.width = window.innerWidth;
  canvas.height = window.innerHeight;

  //context
  let context = canvas.getContext("2d");

  // sets up the color of the filler of the shapes
  context.fillStyle = "rgba(255, 0, 0, 0.5)";

  // Rectangle (notice the style is @override by the new fillStyle)
  context.fillRect(100, 100, 100, 100);
  context.fillStyle = "blue";
  context.fillRect(500, 100, 100, 100);
  context.fillStyle = "green";
  context.fillRect(300, 400, 100, 100);

  // Line (invisible until you set up the stroke)
  context.beginPath();
  context.moveTo(100, 400);
  context.lineTo(300, 200);
  context.lineTo(600, 400);

  // sets up the 'stroke' properties (pay attention to order)
  context.strokeStyle = "#f00";
  context.stroke();

  // Arc / Circle
  for (let i = 0; i < 1000; i++) {
    let xCord = Math.random() * canvas.width;
    let yCord = Math.random() * canvas.height;
    let radius = Math.random() * 50 + 1;
    let color = `rgba(${Math.random() * 254 + 1},${Math.random() * 254 +
      1},${Math.random() * 254 + 1},${Math.random()})`;

    context.beginPath();
    context.arc(
      xCord,
      yCord,
      radius,
      (Math.PI / 180) * 0,
      (Math.PI / 180) * 360,
      true
    );
    context.strokeStyle = color;
    context.stroke();
  }
};
