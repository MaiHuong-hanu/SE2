<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete User</title>
</head>
<body>
<jsp:include page="nav-bar.jsp"></jsp:include>
<form action="" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Id</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="id">
  </div>
  
  <button type="submit" class="btn btn-primary">Delete</button>
</form>
</body>
</html>