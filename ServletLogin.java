package com.telusko;

import java.io.IOException; 
import java.io.PrintWriter; 
  
import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession; 

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/login")
public class ServletLogin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("usName");
		String password=request.getParameter("usPass");
		
		HttpSession session=request.getSession();
		
		if(password.equals("geek"))
		{
			session.setAttribute("username", username);
			response.sendRedirect("Welcome");
		}
		else
		{
			out.println("Wrong Password!! "+ username);
			out.println("Try Again!!");
		}
		
		out.close();
	}

	

}
