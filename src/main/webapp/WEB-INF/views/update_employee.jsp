<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menue.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee List</title>
</head>
<body>
	<h2>Update new employee</h2>
	<form action="updateEmployee" method="post">
		<table>
		       <tr>
				<td><input type="hidden" name="id" value="${employee.id}"/></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><input type="text" name="dob" value="${employee.dob}"/></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName" value="${employee.firstName}"/></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName" value="${employee.lastName}"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="${employee.email}"/></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile" value="${employee.mobile}"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="update"/></td>
			</tr>
		</table>
	
	</form>
	
	${msg}
</body>
</html>