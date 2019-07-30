package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.RegisterDao;

@WebServlet("/Registration")
public class Registration extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		String em = request.getParameter("email");
		String q = request.getParameter("ans");
		
		RegisterDao dao = new RegisterDao();
		
		dao.insert(uname, pass, em, q);
		
		request.setAttribute("successMessage", "Registration Done...Please Login...");
		
		response.sendRedirect("login.jsp");
	}

}
