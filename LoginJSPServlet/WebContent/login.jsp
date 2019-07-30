<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Login" method="post">
		<table style= "margin-left: 350px; margin-top: 200px; background-color: cyan;">
			<tr>
				<td>${successMessage}</td>
			</tr>
			<tr>
				<td><h3>...Login Page...</h3></td>
			</tr>
			<tr>
				<td>UserName : </td><td><input type="text" name="username"></input></td>
			</tr>
			<tr>
				<td>Password : </td><td><input type="password" name="password"></input></td>
			</tr>
			<tr>
				<td>
					<a href="Registration.jsp">Registration</a>
				</td>
				<td>
					<input type="submit" name="submit" value="login" style="background-color: blue; color: white;"></input>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<a href="forgotPwd.jsp">Forgot Password..?</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>