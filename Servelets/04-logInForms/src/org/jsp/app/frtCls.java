package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/frtCls")
public class frtCls extends HttpServlet 
{
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//jdbc Code
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="Select mail from advancejavaonline.usersinfo where mail=? and password=?";
		
		String uname=req.getParameter("us");
		String upass=req.getParameter("pas");
		System.out.println(uname+" "+upass);
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,uname);
			preparedStatement.setString(2,upass);
			
			PrintWriter printwriter=resp.getWriter();
			printwriter.println(uname+" "+upass);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			if(resultSet.next())
			{	
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("sec.html");
				requestDispatcher.include(req,resp);
			}
			else
			{
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("forgot.html");
				requestDispatcher.include(req, resp);
			}
			connection.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
