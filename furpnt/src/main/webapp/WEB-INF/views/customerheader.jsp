<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customerhead</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script><style>
.navbar {
      margin-bottom: 50px;
      border-radius: 0;
      background-color:lavenderblush;
    }
    </style>

</head>
<body>
<div>
<nav class="navbar navbar-inverse">
    <ul class="nav navbar-nav">
       <li><a href="aboutus">ABOUT US</a></li>
      <li><a href="contactus">CONTACT US</a></li>
<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">CATEGERIOUS <span class="caret"></span></a>
        <ul class="dropdown-menu">
         <li><a href="viewcategory?category=living room">LIVING ROOM</a></li>
          <li><a href="viewcategory?category=bedroom">BED ROOM</a></li>
          <li><a href="viewcategory?category=dinningroom">DINNING ROOM</a></li> </ul>
      </li>
    </ul>
 <ul class="nav navbar-nav navbar-right">
      <li><a href="CustomerCheck"><span class="glyphicon glyphicon-view-in"></span> View cart</a></li>
      
      <li><a href="logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    
  </ul>

  </div>
</nav> 

