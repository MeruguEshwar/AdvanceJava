package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SecondCls")
public class SecondCls extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		
		
		String uname=req.getParameter("un");
		String upwd=req.getParameter("pwd");
		System.out.println(uname+" "+upwd);
		
		
	
		PrintWriter printwriter=resp.getWriter();
		printwriter.println(uname+" "+upwd);
	}
}
