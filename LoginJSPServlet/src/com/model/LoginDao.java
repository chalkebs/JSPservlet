package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao 
{
	String url = "jdbc:mysql://localhost:3306/Login1";
	String user = "root";
	String pwd = "password";
	
	String sql = "select * from Log where name=? and pass=?";
	
	public boolean check(String un, String ps)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, un);
			st.setString(2, ps);
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
			{
				return true;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}
}
