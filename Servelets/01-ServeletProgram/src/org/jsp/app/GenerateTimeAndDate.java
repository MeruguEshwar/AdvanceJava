package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/GenerateTimeAndDate")
public class GenerateTimeAndDate extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yy");
		System.out.println(sdf.format(date));
		
		PrintWriter printWriter=res.getWriter();
		printWriter.println("tdy date is"+date);
	}

}
