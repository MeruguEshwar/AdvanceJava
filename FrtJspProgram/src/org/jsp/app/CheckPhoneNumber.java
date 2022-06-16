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
@WebServlet("/CheckPhoneNumber")
public class CheckPhoneNumber extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		String uphone = req.getParameter("ph");
		System.out.println(uphone);
		
		//JDBC
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="select phonenumber from advancejavaonline.usersinfo where phonenumber=?";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection  = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,uphone);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("Otp.jsp");
				requestDispatcher.include(req, resp);
			}
			else
			{
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("Frt.html");
				requestDispatcher.include(req, resp);
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
