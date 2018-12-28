# **Computer Science - Archive**

![Project Image](https://lh3.googleusercontent.com/Lv_KUrY6oKwqtIiuOxnU9bMNMmrGHUB7P4iqkaA8i7j0P4pa_m1PFdqCFEyCOXzyThnV9AYBZYgi8Q=w1920-h1078-rw-no)

> **Editor**: Visual Studio Code

---

### **Table of Contents**

-   [Description](#description)
-   [Sample Code](#sample-code)
-   [License](#license)
-   [Author](#author)

---

## **Description**

Personal archive to store/backup some of my personal and school work, allowing ease of acess to numerous files.

#### Programming Languages:

-   HTML/CSS
-   JavaScript
-   Java
-   Python
-   Markdown

[Back to the top](#computer-science---archive)

---

## **Sample Code**

### Snake Game

##### HTML/CSS

```HTML
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <title>Snake Game</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <canvas id="canvas" width="650" height="650"></canvas>
        <script src="snake.js"></script>
        <style>
            canvas {
                background-color: #000;
            }
        </style>
    </head>
</html>
```

##### JavaScript

```JavaScript
window.onload = function() {
    const cvs = document.getElementById("canvas");
    const ctx = cvs.getContext("2d");

    // some variables
    const cvsW = cvs.width;
    const cvsH = cvs.height;

    const snakeW = 25;
    const snakeH = 25;

    // keeps track of score
    let score = 0;

    // default direction of the snake
    let direction = "right";

    // read users direction
    document.addEventListener("keydown", getDirection);

    function getDirection(e) {
        if (e.keyCode == 65 && direction != "right") {
            direction = "left";
        } else if (e.keyCode == 87 && direction != "down") {
            direction = "up";
        } else if (e.keyCode == 68 && direction != "left") {
            direction = "right";
        } else if (e.keyCode == 83 && direction != "up") {
            direction = "down";
        }
    }

    // draw snake
    function drawSnake(x, y) {
        ctx.fillStyle = "#FFF";
        ctx.fillRect(x * snakeW, y * snakeH, snakeW, snakeH);

        ctx.fillStyle = "#000";
        ctx.strokeRect(x * snakeW, y * snakeH, snakeW, snakeH);
    }

    // create snake array, it will contain 4 cells in default
    const len = 2;
    const snake = [];

    for (let i = len - 1; i >= 0; i--) {
        snake.push({
            x: i,
            y: 0,
        });
    }

    // create some food
    let food = {
        x: Math.round(Math.random() * (cvsW / snakeW - 1)),
        y: Math.round(Math.random() * (cvsH / snakeH - 1)),
    };

    // draw food function
    function drawFood(x, y) {
        ctx.fillStyle = "yellow";
        ctx.fillRect(x * snakeW, y * snakeH, snakeW, snakeH);

        ctx.fillStyle = "#000";
        ctx.strokeRect(x * snakeW, y * snakeH, snakeW, snakeH);
    }

    // check collision
    function checkCollision(x, y, array) {
        for (let i = 0; i < array.length; i++) {
            if (x == array[i].x && y == array[i].y) {
                return true;
            }
        }
        return false;
    }

    // shows score
    function drawScore(x) {
        ctx.fillStyle = "yellow";
        ctx.font = "16px Verdana";
        ctx.fillText(`Score: ${x}`, 16, 24);
    }

    // main draw function
    function draw() {
        // clear canvas
        ctx.clearRect(0, 0, cvsW, cvsH);

        for (let i = 0; i < snake.length; i++) {
            const x = snake[i].x;
            const y = snake[i].y;
            drawSnake(x, y);
        }

        // snake head
        let snakeX = snake[0].x;
        let snakeY = snake[0].y;

        // draw food
        drawFood(food.x, food.y);

        // create new head, based on the previous head and direction
        if (direction == "left") {
            snakeX--;
        } else if (direction == "up") {
            snakeY--;
        } else if (direction == "right") {
            snakeX++;
        } else if (direction == "down") {
            snakeY++;
        }

        // if the snake hits the wall or eats its tail then it's game over
        if (
            snakeX < 0 ||
            snakeY < 0 ||
            snakeX >= cvsW / snakeW ||
            snakeY >= cvsH / snakeH ||
            checkCollision(snakeX, snakeY, snake)
        ) {
            location.reload();
        }

        // if our snake eats the food
        if (snakeX == food.x && snakeY == food.y) {
            food = {
                x: Math.round(Math.random() * (cvsW / snakeW - 1)),
                y: Math.round(Math.random() * (cvsH / snakeH - 1)),
            };
            var newHead = {
                x: snakeX,
                y: snakeY,
            };
            score++;
        } else {
            snake.pop();
            newHead = {
                x: snakeX,
                y: snakeY,
            };
        }
        snake.unshift(newHead);
        drawScore(score);
    }

    setInterval(draw, 60);
};
```

[Back to the top](#computer-science---archive)

---

## **License**

MIT License

Copyright (c) 2018-2019 Sebastian Nunez

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

[Back to the top](#computer-science---archive)

---

## **Author**

-   Twitter - [@mikozera](https://twitter.com/mikozera)

[Back to the top](#computer-science---archive)
