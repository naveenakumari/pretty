<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@include file="aheader.jsp" %>

  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
	.carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  </style>

<div>
<center><img src="resources/images/dd.jpg" style="width:300px;height: 300px"></center>
</div>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
  Data:${ss}
Enter Name/Email ID: <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>item id</th>
    <th> item name</th>
    <th>item description</th>
    <th>item category</th>
    <th> item price</th>
    <th>pic</th>
    </tr>
             <td>${singleKey.itemId}</td>
             <td>${singleKey.itemName}</td>
             <td>${singleKey.description}</td>
             
             <td>${singleKey.category}</td>
            <td>{{singleKey.price}}</td>
            <td><img src="resources/images/{{resource.itemId}}.jpg" style="width:100px;height:100px;"/></td>
           <td> <a href="addtocart?id=${singleKey.itemId}">Add to Cart </a>           
        </tr>    
    </table>
</div>

<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${listofitem}
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
<%@include file="footer.jsp"%>
