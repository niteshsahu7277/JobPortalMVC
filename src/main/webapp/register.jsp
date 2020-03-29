<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@include file="header.jsp" %>
    <!--# Register START #-->

    <div class="limiter">
        <div class="container-login100">
            <div class="wrap-login100">
              <div class="login100-pic js-tilt" data-tilt>
                    <img alt="img" src="<c:url value="/resources/images/img-01.png"/>"/>
                </div>
				
                <form class="login100-form validate-form"> 
                                   <span class="login100-form-title">
                        Member Registration
                    </span>

                    <div class="wrap-input100 validate-input" data-validate="Name is required">
                    <%-- <form:input path="firstName" class="input100" cssClass="form-control" placeholder="First Name"/> --%>
                       <input class="input100" type="text" name="fname" placeholder="First Name">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                            <i class="fa fa-user" aria-hidden="true"></i>
                        </span>
                    </div>

                    <div class="wrap-input100 validate-input" data-validate="Name is required">
                        <input class="input100" type="text" name="lname" placeholder="Last Name">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                            <i class="fa fa-user" aria-hidden="true"></i>
                        </span>
                    </div>

                    <div class="wrap-input100 validate-input" data-validate="Valid email is required: ex@abc.xyz">
                        <input class="input100" type="text" name="email" placeholder="Email">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                            <i class="fa fa-envelope" aria-hidden="true"></i>
                        </span>
                    </div>

                    <div class="wrap-input100 validate-input" data-validate="Password is required">
                        <input class="input100" type="password" name="pass" placeholder="Password">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                            <i class="fa fa-lock" aria-hidden="true"></i>
                        </span>
                    </div>

                    <div class="container-login100-form-btn">
                        <button class="login100-form-btn">
                            Register
                        </button>
                    </div>

                    <div class="text-center p-t-12">
                        <span class="txt1">
                            Forgot
                        </span>
                        <a class="txt2" href="#">
                            Password?
                        </a>
                    </div>

                    <div class="text-center p-t-8">
                        <a class="txt2" href="login.html">
                            Go to Login
                            <i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
                        </a>
                    </div>
                </form>
            </div>
        </div>
    </div>
<br/>
    <!--# Register END #-->
<%@include file="footer.jsp" %>