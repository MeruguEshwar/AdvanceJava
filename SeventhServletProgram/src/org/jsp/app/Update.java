package org.jsp.app;

import java.io.IOException;
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
@WebServlet("/Update")
public class Update extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		/*To fetech html code*/
		String uedition = req.getParameter("ed");
		String utitle=req.getParameter("tt");
		
		/*JDBC code */
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="update advancejavaonline.librarry set Edition=? where BookTitle=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,uedition);
			preparedStatement.setString(2,utitle);
			
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
