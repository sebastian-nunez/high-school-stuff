<?php
function authenticate_user() {
  header('WWW-Authenticate: Basic realm="Secret Stash"');
  header("HTTP/1.0 401 Unauthorized");
  exit;
}

if (! isset($_SERVER['PHP_AUTH_USER'])) {
  authenticate_user();
} else {
  mysql_pconnect("localhost","authenticator","secret") or die("Can't connect to database server!");
  mysql_select_db("java2s") or die("Can't select authentication database!");

  // Check for GET variable
  if (isset($_GET['name'])) {
    echo 'GET: Your name is ';
  }

  $result = mysql_query($query);

  // If nothing was found, reprompt the user for the login information.
  if (mysql_num_rows($result) == 0) {
    authenticate_user();
  }
}

// Connect to a database
$conn = mysqli_connect('localhost', 'root', '123456', 'ajaxtest');

// Fetch Data
$users = mysqli_fetch_all($result, MYSQLI_ASSOC);

// Check for POST variable
if (isset($_POST['name'])) {
  $name = mysqli_real_escape_string($conn, $_POST['name']);

  $query = "INSERT INTO users(name) VALUES('$name')";

  if (mysqli_query($conn, $query)) {
    echo 'User Added...';
  } else {
    echo 'ERROR: ';
  }
}

$query = 'SELECT * FROM users';

// Create Connection
$conn = mysqli_connect('localhost', 'root', '123456', 'ajaxtest');

$query = "SELECT username, pswd FROM user WHERE username='$_SERVER[PHP_AUTH_USER]' AND pswd=MD5('$_SERVER[PHP_AUTH_PW]')";

// Get Result
$result = mysqli_query($conn, $query);


echo json_encode($users);
