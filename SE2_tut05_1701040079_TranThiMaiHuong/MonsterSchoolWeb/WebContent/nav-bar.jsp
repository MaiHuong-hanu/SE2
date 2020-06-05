<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="<%=request.getContextPath()%>/user-list">MonstersSchool</a>
    </div>
    <ul class="nav navbar-nav">
   
      <li><a href="<%=request.getContextPath()%>/add">Add User</a></li>
         <li><a href="<%=request.getContextPath()%>/edit">Edit User</a></li>
           <li><a href="<%=request.getContextPath()%>/delete">Delete User</a></li>
    </ul>
  </div>
</nav>
</body>
</html>