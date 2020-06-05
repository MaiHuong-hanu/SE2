<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
<jsp:include page="nav-bar.jsp"></jsp:include>
<form action="" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Id</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="id">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name">
  </div>
   <div class="form-group">
    <label for="exampleInputEmail1">Address</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="address">
  </div>
    <div class="form-group">
    <label for="exampleInputEmail1">Mobile Phone</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="mobile">
  </div>
  <button type="submit" class="btn btn-primary">Edit</button>
</form>
</body>
</html>