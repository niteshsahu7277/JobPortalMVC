<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Home | JobBazar</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    
        <!--===============================================================================================-->
        <link rel="icon" type="image/png" href="<c:url value="/resources/images/icons/favicon.ico" />">
        <!--===============================================================================================-->
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
            integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    
        <!-- Customised CSS -->
    
        <!--===============================================================================================-->
        <link rel="stylesheet"  href="<c:url value="/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css"/>">
        <!--===============================================================================================-->
        <link rel="stylesheet"  href="<c:url value="/resources/vendor/animate/animate.css"/>">
        <!--===============================================================================================-->
        <link rel="stylesheet"  href="<c:url value="/resources/vendor/css-hamburgers/hamburgers.min.css"/>">
        <!--===============================================================================================-->
        <link rel="stylesheet"  href="<c:url value="/resources/vendor/select2/select2.min.css"/>">
        <!--===============================================================================================-->
        <link rel="stylesheet"  href="<c:url value="/resources/css/util.css"/>">
        <link rel="stylesheet" href="<c:url value="/resources/css/main.css"/>">
        <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
        <!--===============================================================================================-->
    </head>

<body background="<c:url value="/resources/images/officebg.jpg"/>"/>
    <header class="sticky-top">
        <!--- Navbar --->
        <nav class="navbar navbar-expand-lg">
            <div class="container">
                <a class="navbar-brand text-white" href="index.jsp"><i class="fa fa-graduation-cap fa-lg mr-2"></i>JobBazar</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nvbCollapse"
                    aria-controls="nvbCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="nvbCollapse">
                    <ul class="navbar-nav ml-auto">

                        <li class="nav-item active pl-1">
                            <a class="nav-link" href="jobseeker/showRegisterForm"><i class="fa fa-th-list fa-fw mr-1"></i>Register</a>
                        </li>
                        <li class="nav-item pl-1">
                            <a class="nav-link" href="about.html"><i class="fa fa-user-plus fa-fw mr-1"></i>About</a>
                        </li>
                        <li class="nav-item pl-1">
                            <a class="nav-link" href="jobseeker/showLoginForm"><i class="fa fa-sign-in fa-fw mr-1"></i>Login</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!--# Navbar #-->
    </header>
