<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HEYAPP | Login User</title>
</head>
<body>

		<form action="validate.jsp" method="post">
		<table align="center">
			<thead>
				<tr>
					<th colspan="2"><h1>Login Page</th>
				</tr>
			</thead>
	
			<tbody>
				<tr>
					<td>User name</td>
					<td><input type ="text" name="userName"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type ="password" name="userPass"/></td>
				</tr>
				
				<tr align="center">
					<td><a href="reg_form.jsp">SignUp</a></td> 
					<td><input type ="submit" name="login" value="LOGIN"/></td>
				</tr>
				
				<tr align="center">
					<td colspan="2">
					<%=(request.getParameter("error_msg")!=null)?request.getParameter("error_msg"):"" %>
					</td>
				</tr>
				
				
			</tbody>
		</table>
	</form>

</body>
</html>