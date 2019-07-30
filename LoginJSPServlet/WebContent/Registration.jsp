<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function matchpass()
	{
		//checking password
		var firstpassword=document.myForm.password.value;
		var secondpassword=document.myForm.password1.value;

		if(firstpassword==secondpassword)
		{
			return true;
		}
		else
		{
			alert("password must be same!");
			return false;
		}
		
		/* //checking email
		 var emailID = document.myForm.email.value;
         atpos = emailID.indexOf("@");
         dotpos = emailID.lastIndexOf(".");
         
         if (atpos < 1 || ( dotpos - atpos < 2 )) {
            alert("Please enter correct email ID")
            document.myForm.email.focus() ;
            return false;
         }
         return( true ); */
	}
</script>
</head>
<body>
	<form action="Registration" name="myForm" method="post" onsubmit="return matchpass()">
		<table style= "margin-left: 350px; margin-top: 200px; background-color: skyblue;">
			<tr>
				<td><h3>...Registration Page...</h3></td>
			</tr>
			<tr>
				<td>UserName : </td><td><input type="text" name="username"></input></td>
			</tr>
			<tr>
				<td>Password : </td><td><input type="password" name="password"></input></td>
			</tr>
			<tr>
				<td>Confirm Password : </td><td><input type="password" name="password1"></input></td>
			</tr>
			<tr>
				<td>Email : </td><td><input type="text" 
				pattern="/^[a-zA-Z0-9.!#$%&amp;'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/" required 
				name="email"></input></td>
			</tr>
			<tr>
				<td>Your Favourite Animal : </td><td><input type="text" name="ans"></input></td>
			</tr>
			<tr>
				<td>
					<input type="submit" name="submit" value="Register" style="background-color: blue; color: white;"></input>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>