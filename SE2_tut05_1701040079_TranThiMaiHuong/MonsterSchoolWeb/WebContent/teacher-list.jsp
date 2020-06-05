<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- Include the JSTL Core library in JSP --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Monster School Teacher</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
		<div class="container">
		    <br>
			<h3 class="text-center">Monster School Web Teacher List</h3>
            <br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Address</th>
					</tr>
				</thead>
				<tbody>
				    <%-- c:forEach => basic iteration tag --%>
					<c:forEach var="teacher" items="${listTeacher}">
						<tr>
						    <%-- c:out => for expressions --%>
							<td><c:out value="${teacher.id}" /></td>
							<td><c:out value="${teacher.name}" /></td>
							<td><c:out value="${teacher.address}" /></td>
			
					</c:forEach>
				</tbody>
			</table>
		</div>
	
</body>
</html>
