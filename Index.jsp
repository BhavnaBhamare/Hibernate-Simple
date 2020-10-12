<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
<style type="text/css">
tr
{
border: 1cm;
border-color: teal;
margin: 0.5mm;
height: 1.5cm;
text-align: center;
}
</style>
</head>
<body>
	<form action="EmplyoeeServlet" method="post">
		<table align="center" border="20" bordercolor="red" width="80%">
			<tr>
				<th>Data</th>
				<th>Value</th>
			</tr>
			<tr>
				<td>Name:-</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>email:-</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Mobile:-</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>date of birth:-</td>
				<td><input type="text" name="dateofbirth"></td>
			</tr>
			<tr>
				<td>Address:-</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>Salary:-</td>
				<td><input type="text" name="salary"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Add Emplyoee"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><a href="View.jsp">View Emplyoee</a></td>
			</tr>
		</table>
	</form>
</body>
</html>