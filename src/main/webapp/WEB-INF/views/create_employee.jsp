<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menue.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Employee List</title>
</head>
<body>
	<h2>Create new employee</h2>
	<form action="saveEmployee" method="post">
		<table border="2">
			<tr>
				<td>DOB</td>
				<td><input type="text" name="dob"/></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName"/></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"/></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"/></td>
			</tr>
		</table>
	
	</form>
	
	${msg}
</body>
</html>