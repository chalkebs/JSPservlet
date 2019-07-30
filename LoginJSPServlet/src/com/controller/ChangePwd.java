package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.ChangePwdDao;

@WebServlet("/ChangePwd")
public class ChangePwd extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String p1 = request.getParameter("ps1");
		String p2 = request.getParameter("ps2");
		
		ChangePwdDao dao = new ChangePwdDao();
		
		if(dao.change( p1, p2))
		{
			System.out.println("Password changed successfully...");
			response.sendRedirect("login.jsp");
		}
		else
		{	
			System.out.println("You have entered Incorrect old password...");
			response.sendRedirect("changePWD.jsp");
		}
	}

}
