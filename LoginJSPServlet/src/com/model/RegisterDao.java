package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDao 
{
	String url = "jdbc:mysql://localhost:3306/Login1";
	String user = "root";
	String pwd = "password";
	
	String sql = "insert into Log values(?,?,?,?)";
	
	public void insert(String un, String ps, String eml, String ques)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement st = con.prepareStatement(sql);
			
			//System.out.println("starting connection");
			
			st.setString(1, un);
			st.setString(2, ps);
			st.setString(3, eml);
			st.setString(4, ques);
			
			st.executeUpdate();
			
			//.out.println("data entered");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}
