package org.jsp.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CheckEmailId")
public class CheckEmailId extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//fetching details from html
		String umail = request.getParameter("nm");
		System.out.println(umail);
		
		//Push the date from user
		ServletContext context=getServletContext();
		context.setAttribute("ty",umail);
		
		//jdbc Code
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="Select mail from advancejavaonline.usersinfo where mail=?";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,umail);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("Pass.html");
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
