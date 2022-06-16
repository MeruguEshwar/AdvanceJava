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
@WebServlet("/Search")
public class Search extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		String query = "select * from  advancejavaonline.librarry where BookTitle= ?";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			
			String usearch=req.getParameter("text");
			preparedStatement.setString(1,usearch);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				PrintWriter printWriter = resp.getWriter();
				printWriter.println(usearch);
			}
			else
			{
				System.out.println("Invalid!!");
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
