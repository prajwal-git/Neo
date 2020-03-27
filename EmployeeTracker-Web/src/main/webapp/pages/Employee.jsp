<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring web app</title>
</head>
<body>
<form action = "addEmployee" >
<label>Id : </label><input type = "text" name = "eid" /> <br>

<label>Name : </label> <input type = "text" name = "empName" /> <br>

<label>Project :</label> <input type = "text" name = "projectName" /> <br>

<input type="submit"><br>

</form> 


<form action = "fetchEmployee" >
<label>Id : </label><input type = "text" name = "eid" /> <br>

<input type="submit"><br>

</form> 



<form action = "fetchEmployeeByProjectSorted" >
<label>Project :</label> <input type = "text" name = "projectName" /> <br>

<input type="submit"><br>

</form> 

</body>
</html>
