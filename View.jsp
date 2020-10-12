<%@page import="com.pojo.Emplyoee"%>
<%@page import="java.util.List"%>
<%@page import="com.model.BLManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

	<%
		BLManager bl = new BLManager();
		List<Emplyoee> l = bl.getAllEmp();
		session.setAttribute("list", l);
	%>
<center><h1>Employee Details</h1></center>

	<table border="2" width="100%">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>MOBILE</th>
			<th>DATE OF BIRTH</th> 
			<th>ADDRESS</th>
			<th>SALARY</th>
			<th>DELETE</th>
			<th>UPDATE</th>
		</tr>
		<c:forEach items="${sessionScope.list }" var="l">

			<tr>

				<td>${l.id}</td>
				<td>${l.name}</td>
				<td>${l.email}</td>
				<td>${l.mobile}</td>
				<td>${l.dateofbirth}</td>
				<td>${l.address}</td>
				<td>${l.salary}</td>
				<td><a href="DeleteServlet?id=${l.id}"> Delete</a></td>
				<td><a href="UpdateServlet?id=${l.id}"> Update</a></td>

			</tr>


		</c:forEach>
			<tr>
				<td colspan="9" ><a href="Index.jsp"> Add Records</a></td>
			</tr>
	</table>
	<br>
	<br>

	

</body>
</html>