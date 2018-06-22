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
    <style>
        * {
            margin: 0;
        }
        html, body {
            height: 100%;
        }
        .page-wrap {
            min-height: 100%;
            /* equal to footer height */
            margin-bottom: -142px;
        }
        .page-wrap:after {
            content: "";
            display: block;
        }
        .site-footer, .page-wrap:after {
            /* .push must be the same height as footer */
            height: 142px;
        }
        .site-footer {
            background: orange;
        }

    </style>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Fee Manager</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" ntegrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<nav class="w3-bar w3-black w3-large w3-border">
    <div class="w3-content w3-margin-top">
            <a class="w3-bar-item w3-hover-none w3-text-grey w3-hover-text-white w3-button w3-padding-16" href="index.html" style="text-decoration: none">Fee Report</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="index.html">Home</a></li>
            </ul>

        </div>
    </div>
</nav>
<div class="container page-wrap">
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
<footer class="w3-container w3-black w3-center w3-margin-top site-footer">
    <p>&copy;Copyright 2017. Fee management corp.</p>
    <button class="w3-btn" id="facebook">
        <i class="fa fa-facebook-official w3-hover-opacity w3-xlarge"></i>
    </button>
    <button class="w3-btn" id="insta">
        <i class="fa fa-instagram w3-hover-opacity w3-xlarge"></i>
    </button>
    <button class="w3-btn" id="twitter">
        <i class="fa fa-twitter w3-hover-opacity w3-xlarge"></i>
    </button>
    <button class="w3-btn" id="linkedIn">
        <i class="fa fa-linkedin w3-hover-opacity w3-xlarge"></i>
    </button>
</footer>
<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</body>
</html>
