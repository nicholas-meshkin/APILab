<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css" rel="stylesheet" integrity="sha384-LS4/wo5Z/8SLpOLHs0IbuPAGOWTx30XSoZJ8o7WKH0UJhRpjXXTpODOjfVnNjeHu" crossorigin="anonymous">
<title>Complete</title>
</head>
<body>
<div class="container">
		<table class="table table-striped">
			<tr>
				<th class="h2">First</th>
				<th class="h2">Last</th>
				<th class="h2">Year</th>
				<th class="h2">Innovation</th>
			</tr>
			<c:forEach var="complete" items="${list}">
				<tr>
					<td class="h6">${complete.firstName }</td>
					<td class="h6">${complete.lastName }</td>
					<td class="h6">${complete.year}</td>
					<td class="h6">${complete.innovation}</td>
				</tr>
			</c:forEach>
		</table>
		<a class="btn btn-primary mb-4" href="/">Home</a>
	</div>
</body>
</html>