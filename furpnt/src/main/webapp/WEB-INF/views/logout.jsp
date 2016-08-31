<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="logouthead.jsp" %>
<% 
session.invalidate();
%>

<!-- <h1 style="text-align: center;">Thank You for Using Furniture Point</h1> -->
<div img="center">
<img src="resources/images/tt.jpg"style="width:100%;height:70%">
</div>
<%@include file="footer.jsp" %>