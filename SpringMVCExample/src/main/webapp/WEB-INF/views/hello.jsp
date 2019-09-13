<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" charset="ISO-8859-1" content="text/html">
<title>springMVC</title>
</head>
<body>
	<h1>Hello this is my first MVC</h1>
	
 	<%
	Integer id = (Integer)request.getAttribute("id");
	String name = (String)request.getAttribute("name");
	String salary = (String)request.getAttribute("salary");
	
	out.println("id: "+id);
	out.println("name: "+name);
	out.println("salary: "+salary);
	%>
	<br/>
	Id:
	<b>${id}</b>
	Name:
	<b>${name}</b>
	Salary:
	<b>${salary}</b>

</body>
</html>