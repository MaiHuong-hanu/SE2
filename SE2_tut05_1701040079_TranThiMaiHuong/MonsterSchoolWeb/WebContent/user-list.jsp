<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- Include the JSTL Core library in JSP --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Monster School Management</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="nav-bar.jsp"></jsp:include>
		<div class="container">
		    <br>
			<h3 class="text-center">Monster School Web User List</h3>
            <br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Address</th>
						<th>Mobile</th>
					</tr>
				</thead>
				<tbody>
				    <%-- c:forEach => basic iteration tag --%>
					<c:forEach var="user" items="${listUser}">
						<tr>
						    <%-- c:out => for expressions --%>
							<td><c:out value="${user.id}" /></td>
							<td><c:out value="${user.name}" /></td>
							<td><c:out value="${user.address}" /></td>
							<td><c:out value="${user.mobile}" /></td>
	
					</c:forEach>
				</tbody>
			</table>
		</div>
	
</body>
</html>
