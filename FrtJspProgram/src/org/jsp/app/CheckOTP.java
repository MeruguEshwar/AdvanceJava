package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckOTP")
public class CheckOTP extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int uotp=Integer.parseInt(req.getParameter("rotp"));
		
		
		//pull the data from attributes using context object
		ServletContext context = getServletContext();
		int gotp = (int) context.getAttribute("run");
		
		PrintWriter printWriter=resp.getWriter();
		
		
		if(uotp == gotp)
		{
			System.out.println("otp is verified");
			printWriter.println("otp is verified");
		}
		else
		{
			System.out.println("otp is not verified");
			printWriter.println("otp is not verified");
		}
	}
}