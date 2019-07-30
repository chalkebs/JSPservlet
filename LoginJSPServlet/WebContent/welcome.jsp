<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@page import="java.sql.Connection"%>
	<%@page import="java.sql.DriverManager"%>
	<%@page import="java.sql.PreparedStatement"%>
	<%@page import="java.sql.ResultSet"%>
	
	<%
		if(session.getAttribute("username")==null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
	Welcome ${username}
	<br>
	<form action="Logout">
		<input type="submit" value="Logout"></input>
	</form>
	<br>
	<a href="changePWD.jsp">Change Password</a>
	<br>
	<%
		String url = "jdbc:mysql://localhost:3306/Login1";
		String user = "root";
		String pwd = "password";
	
		String sql = "select * from Log";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement st = con.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next())
			{
	%>
	
	<table>
		<tr>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getString("pass")%></td>
			<td><%=rs.getString("email")%></td>
		</tr>
	</table>
	
	<%		}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	%>
	
</body>
</html>