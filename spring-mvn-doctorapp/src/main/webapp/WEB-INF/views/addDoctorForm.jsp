<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addDoctor">

Enter Doctor Name:<input type="text" name="doctorName"><br><br>
Enter Doctor Speciality:
<select name="speciality">
<option value="cardiologist">CARDIOLOGIST</option>
    <option value="dermotologist">DERMOTOLOGIST</option>
    <option value="pediatrician">PEDIATRICIAN</option>
    <option value="orthopedist">ORTHOPEDIST</option>
</select><br><br>
Enter Doctor Fees:<input type="number" name="fees"><br><br>

Enter Ratings:
<select name="ratings">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
</select><br><br>
Enter Doctor Experience:<input type="number" name="experience"><br><br>
<input type="submit" value="submit"><br><br>

</form>
</body>
</html>