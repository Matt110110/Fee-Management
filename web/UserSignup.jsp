<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="javafx.scene.control.Alert" %><%--
  Created by IntelliJ IDEA.
  User: matru
  Date: 24-06-2018
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Signup</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
    <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
    <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
    <link rel="stylesheet" type="text/css" href="vendor1/animate/animate.css">
    <link rel="stylesheet" type="text/css" href="vendor1/css-hamburgers/hamburgers.min.css">
    <link rel="stylesheet" type="text/css" href="vendor1/animsition/css/animsition.min.css">
    <link rel="stylesheet" type="text/css" href="vendor1/select2/select2.min.css">
    <link rel="stylesheet" type="text/css" href="vendor1/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" type="text/css" href="css1/util.css">
    <link rel="stylesheet" type="text/css" href="css1/main.css">
</head>
<body style="background-color: #999999;">

<div class="limiter">
    <div class="container-login100">
        <div class="login100-more" style="background-image: url('images/bg-01.jpg');"></div>

        <div class="wrap-login100 p-l-50 p-r-50 p-t-72 p-b-50">
            <form class="login100-form validate-form" action="SignupUser" method="post">
					<span class="login100-form-title p-b-59">
						Sign Up
					</span>

                <div class="wrap-input100 validate-input" data-validate="First name is required">
                    <span class="label-input100">First Name</span>
                    <input class="input100" type="text" name="fname" placeholder="First Name">
                    <span class="focus-input100"></span>
                </div>
                <div class="wrap-input100 validate-input" data-validate="Last name is required">
                    <span class="label-input100">Last Name</span>
                    <input class="input100" type="text" name="lname" placeholder="Last Name">
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
                    <span class="label-input100">Email</span>
                    <input class="input100" type="text" name="email" placeholder="Email address...">
                    <span class="focus-input100"></span>
                </div>
                <div class="wrap-input100">
                    <span class="label-input100">Phone number</span>
                    <input class="input100" type="number" name="name" placeholder="1234567890">
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input" data-validate="Username is required">
                    <span class="label-input100">Username</span>
                    <input class="input100" type="text" name="username" placeholder="Username...">
                    <span class="focus-input100"></span>
                </div>
                <div class="wrap-input100 validate-input" data-validate = "Password is required">
                    <span class="label-input100">Password</span>
                    <input class="input100" type="password" name="pass" placeholder="*************">
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input" data-validate = "Repeat Password is required">
                    <span class="label-input100">Repeat Password</span>
                    <input class="input100" type="password" name="repeat-pass" placeholder="*************">
                    <span class="focus-input100"></span>
                </div>
                <div class="container-login100-form-btn">
                    <div class="wrap-login100-form-btn">
                        <div class="login100-form-bgbtn"></div>
                        <button class="login100-form-btn">
                            Sign Up
                        </button>
                    </div>

                    <a href="#" class="dis-block txt3 hov1 p-r-30 p-t-10 p-b-10 p-l-30">
                        Sign in
                        <i class="fa fa-long-arrow-right m-l-5"></i>
                    </a>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="vendor1/jquery/jquery-3.2.1.min.js"></script>
<script src="vendor1/animsition/js/animsition.min.js"></script>
<script src="vendor1/bootstrap/js/popper.js"></script>
<script src="vendor1/bootstrap/js/bootstrap.min.js"></script>
<script src="vendor1/select2/select2.min.js"></script>
<script src="vendor1/daterangepicker/moment.min.js"></script>
<script src="vendor1/daterangepicker/daterangepicker.js"></script>
<script src="vendor1/countdowntime/countdowntime.js"></script>
<script src="js/main.js"></script>
</body>
</html>
