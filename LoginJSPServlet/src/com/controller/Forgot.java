package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.ForgotPwdDao;

@WebServlet("/Forgot")
public class Forgot extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String e = request.getParameter("email");
		String q = request.getParameter("ans");
		
		ForgotPwdDao dao = new ForgotPwdDao();
		
		if(dao.check(e, q))
		{
			System.out.println("Password is send to your email id successfully...");
			response.sendRedirect("login.jsp");
		}
		else
		{	
			System.out.println("Email id or Answer is wrong...");
			response.sendRedirect("login.jsp");
		}
		
	}

}
