<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<table id="classificationTable">
		<thead>
			<tr>
				<th>Project Name</th>
				<th>Description</th>
			<!--  	<th>Edit</th>
				<th>Delete</th>-->
			</tr>
		</thead>
		<tbody>

		</tbody>
	</table>

	<form:form action="save" method="post"
		modelAttribute="project">
		<h5>Enter Project Details</h5>
		<br>
		<table border=1>
			<tr>
				<td>Project Name :</td>
				<td><form:input path="projectName" id="projectName" />
				</td>
			</tr>
			<tr>
				<td>Description :</td>
				<td><form:input path="description"
						id="description" /></td>
			</tr>
		</table>
		<input type="submit" value="Save" />

	</form:form>


</body>
</html>



