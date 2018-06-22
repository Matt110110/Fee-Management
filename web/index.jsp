<%--
  Created by IntelliJ IDEA.
  User: matru
  Date: 22-06-2018
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fee Manager</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-inverse ">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html">Fee Report</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="index.html">Home</a></li>
            </ul>

        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="container">
    <div class="row">
        <div class="col-md-6 w3-pale-red" id="admin">
            <center>
                <img src="https://images.vexels.com/media/users/3/131263/isolated/preview/af6816ec67ec51da6b275a4aa08d236c-c-rculo-icono-de-un-candado-by-vexels.png" class="img-responsive w3-hover-sepia">
                <h2>Admin Login</h2>
                <a href="./loginAdmin.html">
                    <button class="btn-primary btn-lg btn-block">Log in</button>
                </a>
            </center>
        </div>

        <div class="col-md-6 w3-pale-green" id="accountant">
            <center>
                <img src="http://krmangalam.edu.in/wp-content/uploads/2018/02/Student-login-icon.png" class="img-responsive w3-hover-sepia">
                <h2>Accountant Login</h2>
                <a href="./loginAccountant.html">
                    <button class="btn-primary btn-lg btn-block">Log in</button>
                </a>
            </center>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</body>
</html>
