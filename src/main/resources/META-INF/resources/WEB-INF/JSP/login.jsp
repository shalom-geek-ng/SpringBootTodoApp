<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
	Name: <input type="text" required="required" name="name"></input>
	Password: <input type="password"required="required" name="password"></input>
	<input type="submit"></input>
	</form>
	<pre>${Error }</pre>
</body>
</html>