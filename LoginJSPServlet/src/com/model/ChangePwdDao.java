package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ChangePwdDao 
{
	String url = "jdbc:mysql://localhost:3306/Login1";
	String user = "root";
	String pwd = "password";
	
	String sql = "select * from Log where pass=?";
	
	public boolean change(String ps1, String ps2)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, ps1);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
			{
				String p = rs.getString(2);
				if(p.equals(ps1))
				{
					PreparedStatement st1=con.prepareStatement("update Log set pass=? where pass=?");
					st1.setString(1, ps2);
					st1.setString(2, ps1);
					
					st1.executeUpdate();
					return true;
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}
}
