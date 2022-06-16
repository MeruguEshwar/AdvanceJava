package org.jsp.app;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/LibraryManagmentSystem")
public class LibraryManagmentSystem extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		String query="insert into advancejavaonline.librarry values(?,?,?,?,?)";
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			
			
			String uBooktitle=req.getParameter("BT");
			preparedStatement.setString(1,uBooktitle);
			
			String uAuthor=req.getParameter("At");
			preparedStatement.setString(2,uAuthor);
			
			
			String uEdition=req.getParameter("ED");
			preparedStatement.setString(3,uEdition);
			
			String uPrice=req.getParameter("PC");
			preparedStatement.setString(4,uPrice);
			
			String uType=req.getParameter("TP");
			preparedStatement.setString(5,uType);
			
			
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
