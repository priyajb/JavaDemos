<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div style="text-align:right">
		<a href="admin"><button>Admin Login</button></a><br><br>
	</div>
	<form action="search">
		Enter Speciality
		<input type="text" name="choice" placeholder="enter the speciality"><br><br>
		<input type="submit" value="Submit">
	</form>
	
	<h2>All Doctor</h2>
	${doctor}
	<h2 style="{color:red}">${message}</h2>
		

	
</body>
</html>