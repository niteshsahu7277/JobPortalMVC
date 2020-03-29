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
					<form:form action="loginJobSeeker" cssClass="login100-form validate-form" modelAttribute="jobseeker">
					<span class="login100-form-title">
                        Member Login
                        </span>
                      <div class="wrap-input100 validate-input" data-validate="Valid email is required: ex@abc.xyz">
                    <form:input path="email" placeholder="Email" cssClass="input100"/>
                    <span class="focus-input100"></span>
                        <span class="symbol-input100">
                            <i class="fa fa-envelope" aria-hidden="true"></i>
                        </span>
                    </div>
                      <div class="wrap-input100 validate-input" data-validate="Password is required">
                    <form:password path="password" placeholder="Password" cssClass="input100"/>
                    <span class="focus-input100"></span>
                        <span class="symbol-input100">
                            <i class="fa fa-lock" aria-hidden="true"></i>
                        </span>
                    </div>
                    
                     <div class="container-login100-form-btn">
                     <form:button cssClass="login100-form-btn">Submit</form:button>
                     </div>
					
					</form:form>
            </div>
        </div>
    </div>
 <div style="color: red">${error}</div>

    <!--# Register END #-->
<%@include file="footer.jsp" %>
