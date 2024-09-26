<%@page import="com.systex.eBiz.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Students</title>
<link href="<%= request.getContextPath() %>/style/MyStyle.css" rel="stylesheet"></link>
</head>
<body>
	<h2>List All Students</h2>
	<table border="1" style="margin: auto; text-align: Left;">
		<thead>
			<tr><th>ID</th><th>Name</th><th>Age</th><th>Email</th><th>Action</th></tr>
		</thead>
		<tbody>
			<%List<Student> students = (List<Student>)request.getAttribute("students");%>
			<%for (Student s : students) {%>
				<tr>
					<td><%= s.getId() %></td>
					<td><%= s.getName() %></td>
					<td><%= s.getAge() %></td>
					<td><%= s.getEmail() %></td>
					<td>
						<a href="updateStudent/<%= s.getId() %>">修改</a>
						<a href="deleteStudent/<%= s.getId() %>">刪除</a>
					</td>
				</tr>
			<%}%>
		</tbody>
	</table>
	<a href="index.jsp">Go Home</a>
</body>
</html>