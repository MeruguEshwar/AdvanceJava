package org.jsp.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/PassUpdate")
public class PassUpdate extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//fetching details from html
		String ups = request.getParameter("ps");
		System.out.println(ups);
		String ucnps = request.getParameter("cnps");
		System.out.println(ucnps);
	
		
		//Push the date from user
		ServletContext context=getServletContext();
		String umail=(String) context.getAttribute("ty");
		System.out.println(umail);
		

		//jdbc Code
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="update advancejavaonline.usersinfo set password=? where mail=?";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,ups);
			preparedStatement.setString(2,umail);
			
			preparedStatement.executeUpdate();
			
			if(ups.equals(ucnps))
			{
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("LogIn.html");
				requestDispatcher.include(request, response);
			}
			else
			{
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("email.html");
				requestDispatcher.include(request, response);
			}
			connection.close();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
