<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My application</title>
</head>
<body>
	<h1>Welcome to JSP</h1>
	<p style="color:red">${errorMessage}</p>
	<form action="/spring-mvc/login" method="post">
		Name: <input type="text" name="name"/> 
		Password: <input type="password" name="password"/>
		<input type="submit" value="Login"/>
	</form>
</body>
</html>