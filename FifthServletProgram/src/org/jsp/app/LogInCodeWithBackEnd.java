package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/LogInCodeWithBackEnd")
public class LogInCodeWithBackEnd extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		/*To print on console*/
		String uEmail = req.getParameter("em");
		String upassword = req.getParameter("pwd");
		System.out.println(uEmail+" "+upassword);
		
		/*To print on broswer*/
		PrintWriter printWriter = res.getWriter();
		printWriter.println(uEmail+" "+upassword);
	}

}
