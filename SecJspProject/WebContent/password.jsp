<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Given Email id
<%=application.getAttribute("run") %>
is registered
	
<form action="Secondcls" method="post">
	Password:<input name="ps">
	<br><br>
	<input type="submit" value="Next">
</form>
</body>
</html>