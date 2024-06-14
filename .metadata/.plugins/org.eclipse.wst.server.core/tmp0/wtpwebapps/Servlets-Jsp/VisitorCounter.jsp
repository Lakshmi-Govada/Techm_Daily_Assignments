<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>Visitor Count</title>
</head>
<body>
	<h2>Visitor Counter</h2>
    <p>This page has been visited <%= request.getAttribute("visitorCount") %> times.</p>
</body>
</html>