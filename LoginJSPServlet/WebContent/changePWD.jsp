<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ChangePwd" method="post">
		<table style= "margin-left: 350px; margin-top: 200px; background-color: gray;">
			<tr>
				<td><h3>...Change Password Page...</h3></td>
			</tr>
			<tr>
				<td>Old Password : </td><td><input type="text" name="ps1"></input></td>
			</tr>
			<tr>
				<td>New Password : </td><td><input type="text" name="ps2"></input></td>
			</tr>
			<tr>
				<td>
					<input type="submit" name="submit" value="Submit" style="background-color: blue; color: white;"></input>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>