
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- --Scriptlets- -->
<% Random random=new Random();
   int genOTP = random.nextInt(10000); 

	if(genOTP < 0)
	{
		genOTP = genOTP*-1;
	}
	if(genOTP < 1000)
	{
		genOTP = genOTP+1000;
	}

%>

<h3>OTP is:<%= genOTP %></h3>
<form action="CheckOTP" method="post">
	Enter OTP to Verify:<input name="rotp">
	<br><br>
	<input type="submit" value="verify">
</form>

<!-- --Pushing the data from jsp file into attributes -->
<%
	application.setAttribute("run",genOTP);
%>
</body>
</html>