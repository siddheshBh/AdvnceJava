<%@page import="com.dto.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.service.UserServiceImple"%>
<%@page import="com.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="user" class="com.dto.User" scope="page"></jsp:useBean>

<%
	UserService userService = new UserServiceImple();
	ArrayList<User> arr = userService.seAll(user.getUserName());
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HelloAPP | </title>
</head>
<body>

	<%
		for(User ur : arr){
	%>

	<h1><%=ur.getName() %></h1>
	<h1><%=ur.getUserName() %></h1>
	<h1><%=ur.getUserPass() %></h1>
	<%
		}
	%>
</body>
</html>