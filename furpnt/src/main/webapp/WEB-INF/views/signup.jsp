<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<nav class="navbar navbar-inverse">
    <ul class="nav navbar-nav">
       <li><a href="file:///F:/furniture/about%20us.html">ABOUT US</a><li>
      <li><a href="file:///F:/furniture/contactus.html">CONTACT US</a></li>
<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">CATEGERIOUS <span class="caret"></span></a>
        <ul class="dropdown-menu">
         <li><a href="file:///F:/furniture/livingrm.html">LIVING ROOM</a></li>
          <li><a href="file:///F:/furniture/bedroom.html">BED ROOM</a></li>
          <li><a href="file:///F:/furniture/dinning.html">DINNING ROOM</a></li> </ul>
      </li>
    </ul>
 <ul class="nav navbar-nav navbar-right">
      <li><a href="signUp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="CustomerCheck"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
  </ul>

  </div>
</nav> 
<table class="table table-striped">
<form:form action="register" commandName="customerobj" method="POST">
<tr><td>UserName:</td><td><form:input path="username"></form:input><form:errors path="username" style="color:red"></form:errors></td>
<tr><td>Password:</td><td><form:password path="password"></form:password><form:errors path="password" style="color:red"></form:errors></td>
<tr><td>EmailId</td><td><form:input path="emailid"></form:input><form:errors path="emailid" style="color:red"></form:errors></td>
<tr><td><input type="submit" value="register"></td></tr>
</form:form>
</table>
<%@include file="footer.jsp" %>
</body>
</html>