<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="menue.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of all Employee</title>
</head>
<body>
	<table border='3'>
		<tr>
			<th>DOB</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<c:forEach var="employ" items="${employees}">
		<tr>
			<td>${employ.dob}</td>
			<td>${employ.firstName}</td>
			<td>${employ.lastName}</td>
			<td>${employ.email}</td>
			<td>${employ.mobile}</td>
			<td><a href="delete?id=${employ.id}">delete</a></td>
			<td><a href="update?id=${employ.id}">update</a></td>
		</tr>

        </c:forEach>
	</table>
</body>
</html>