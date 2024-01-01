<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
	<h1>Welcome ${name }</h1>
	<table class="table">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Description</th>
				<th>Date</th>
				<th>Done</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${todo }" var="todo">
		<tr>
			<td>${todo.id }</td>
			<td>${todo.name }</td>
			<td>${todo.description }</td>
			<td>${todo.date }</td>
			<td>${todo.done }</td>
		</tr>
		</c:forEach>
		</tbody>
	</table>
	<a href="/addTodo"><button class="btn btn-success">Add Item</button></a>
	</div>
	
	<script src="/webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
	<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>