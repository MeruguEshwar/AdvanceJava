package org.jsp.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/BackEndProgram")

public class BackEndProgram extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="insert into advancejavaonline.checkbox values (?)";
		
		String s1=" ";
		String arr[] = req.getParameterValues("ra");
		for(int index=0 ; index<=arr.length-1; index++)
		{
			System.out.println(arr[index]);
			
		}
		System.out.println(s1);
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection= DriverManager.getConnection(url);
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, s1);
			preparedStatement.executeUpdate();
			connection.close();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
