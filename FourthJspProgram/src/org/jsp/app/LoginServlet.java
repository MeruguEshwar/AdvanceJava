package org.jsp.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//fetching html code
		String uphone=request.getParameter("ph");
		
		//JDBC CODE
		String url= "jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="select phonenumber from advancejavaonline.usersinfo where phonenumber=?";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			//Pass the values to place holder
			preparedStatement.setString(1,uphone);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				//creating session
				HttpSession session=request.getSession();
				
				//Push the values into session object
				session.setAttribute("rn",uphone);
				
				//Time limit for Session object
				session.setMaxInactiveInterval(200);
				
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("/LogoutServlet");
				requestDispatcher.include(request, response);
			}
			else
			{
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("Login.html");
				requestDispatcher.include(request, response);
			}
		
			connection.close();
		} 
		catch (Exception e) 
		{
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("Login.html");
			requestDispatcher.include(request, response);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
