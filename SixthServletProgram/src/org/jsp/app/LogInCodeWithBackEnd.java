/*Log in code with backendconnection*/
package org.jsp.app;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/LogInCodeWithBackEnd")
public class LogInCodeWithBackEnd extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{		
		/*To print on console*/
		String uEmail=req.getParameter("em");
		String uPassword=req.getParameter("pwd");
		System.out.println(uEmail+" "+uPassword);
		
	
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="select mail from advancejavaonline.usersinfo where mail=? ";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,uEmail);
			
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				/*To print on the broswer*/
				PrintWriter printWriter=resp.getWriter();
				printWriter.println(uEmail+" "+uPassword);
				System.out.println("Successfull.......");
			}
			else
			{
				System.out.println("Unsuccessful....!!");
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
