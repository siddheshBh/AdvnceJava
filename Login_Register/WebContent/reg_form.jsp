<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HeyAPP | Registaration</title>
</head>
<body>
	<form action="reg.jsp" method="post">
		<table align="center">
			<thead>
				<tr>
					<th colspan="2"><h1>Registeration Page</th>
				</tr>
			</thead>
	
			<tbody>
				
				<tr>
					<td>Full name</td>
					<td><input type ="text" name="name"/></td>
				</tr>
				
				<tr>
					<td>User name</td>
					<td><input type ="text" name="userName"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type ="password" name="userPass"/></td>
				</tr>
				
				<tr align="center">
					<td><a href="login.jsp">SignUp</a></td> 
					<td><input type ="submit" name="login" value="REGISTER"/></td>
				</tr>
				
				
			</tbody>
		</table>
	</form>
</body>
</html>