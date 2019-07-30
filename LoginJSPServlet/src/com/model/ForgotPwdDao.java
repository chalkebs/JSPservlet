package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ForgotPwdDao 
{
	String url = "jdbc:mysql://localhost:3306/Login1";
	String user = "root";
	String pwd = "password";
	
	String sql = "select * from Log where email=? and ques=?";

	public boolean check(String email, String ques)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement st = con.prepareStatement(sql);
			
			//System.out.println("starting connection");
			
			st.setString(1, email);
			st.setString(2, ques);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
			{	
				String a = rs.getString(2);
		
				System.out.println(a);
				
				return true;
			}
			//System.out.println("data entered");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
		
	}
}
