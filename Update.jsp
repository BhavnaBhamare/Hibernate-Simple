<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<form action="UpdateServlet" method="post">
		<table align="center" border="20" bordercolor="red" width="80%">
			<tr>
				<th>Data</th>
				<th>Value</th>
			</tr>
			<tr>
				<td>Name:-</td>
				<td><input type="text" name="name" value="${list.name}"></td>
			</tr>
			<tr>
				<td>email:-</td>
				<td><input type="text" name="email" value="${list.email}"></td>
			</tr>
			<tr>
				<td>Mobile:-</td>
				<td><input type="text" name="mobile" value="${list.mobile}"></td>
			</tr>
			<tr>
				<td>date of birth:-</td>
				<td><input type="text" name="dateofbirth" value="${list.dateofbirth}"></td>
			</tr>
			<tr>
				<td>Address:-</td>
				<td><input type="text" name="address"value="${list.address}"></td>
			</tr>
			<tr>
				<td>Salary:-</td>
				<td><input type="text" name="salary"value="${list.salary}"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Submit Emplyoee"></td>
			</tr>
		</table>
	</form>
</body>
</html>