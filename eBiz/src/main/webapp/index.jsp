<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to my Spring Boot playground~</title>
<link href="<%= request.getContextPath() %>/style/MyStyle.css" rel="stylesheet"></link>
</head>
<body>
	<h1>Welcome to my Spring Boot playground~</h1>
	<p>Current time is <%= SimpleDateFormat.getInstance().format(new Date()) %>></p>
	<a href="hello">Hello</a>
	<a href="student">Add Student</a>
	<a href="listStudents">List Student</a>
	<a href="spa/index.html">SPA Demo</a>
</body>
</html>