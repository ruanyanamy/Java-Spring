<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC FormHandling - Result</title>
<link href="<%= request.getContextPath() %>/style/MyStyle.css" rel="stylesheet"></link>
</head>
<body>
	<h2>Submitted Student Information</h2>
	<table border="1" style="margin: auto; text-align: Left;">
		<tbody>
			<tr>
				<td>Name</td>
				<td>${student.name}</td>
			</tr>
			<tr>
				<td>Age</td>
				<td>${student.age}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${student.email}</td>
			</tr>
		</tbody>
	</table>
	<a href="index.jsp">Go Home</a>
</body>
</html>