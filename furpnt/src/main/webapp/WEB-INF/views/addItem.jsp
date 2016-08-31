<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="aheader.jsp" %>
<table class="table table-striped">

<form:form action="addProduct" commandName="i" method="POST" enctype="multipart/form-data">
<tr><td>Item Name:</td><td><form:input path="itemName"></form:input><form:errors path="itemName" style="color:red"></form:errors></td>
<tr><td>Item description:</td><td><form:input path="description"></form:input><form:errors path="description" style="color:red"></form:errors></td>
<tr><td>Item price:</td><td><form:input path="price"></form:input></tr></td>
<tr><td>Item category:
<form:select path="category">
<form:option value="living room"></form:option>
<form:option value="bedroom"></form:option>
<form:option value="dinningroom"></form:option>
</form:select></tr></td>
<tr><td>ItemImage<input type="file" path="file" name="file"requried/></tr></td>
<tr><td><input type="submit" value="AddProduct"/></tr></td>

</form:form>
</table>
<%@include file="footer.jsp" %>
</body>

</html>