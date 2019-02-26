<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css" rel="stylesheet" integrity="sha384-LS4/wo5Z/8SLpOLHs0IbuPAGOWTx30XSoZJ8o7WKH0UJhRpjXXTpODOjfVnNjeHu" crossorigin="anonymous">
<title>Home</title>
</head>
<body>
	<div class="container">
		<table class="table table-striped">
			<tr>
				<th class="h2">Name</th>
				<th class="h2">Year</th>
				<th class="h2">Invented</th>
			</tr>
			<c:forEach var="tiny" items="${list}">
				<tr>
					<td class="h6">${tiny.name }</td>
					<td class="h6">${tiny.year}</td>
					<td class="h6">${tiny.invented}</td>
				</tr>
			</c:forEach>
		</table>
		<a class="btn btn-primary" href="/complete">Complete info list</a>
	</div>
	
</body>
</html>