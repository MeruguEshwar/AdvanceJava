package org.jsp.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		
		String mob = (String) session.getAttribute("rn");
		System.out.println(mob);
		
		session.invalidate();
		
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("logout.html");
		requestDispatcher.include(request, response);
	}

}
