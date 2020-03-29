<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="header.jsp"  %>

<h2 align="center">Welcome To JobBazar</h2>
			<hr color="pink" size="3" />

<div style="color: blue" align="center">
Welcome  ${jobseeker.firstName} 
<br/>
<br/>
<br/>
Email Id: ${jobseeker.email} </div>


<%@ include file="footer.jsp"  %>