package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/*Log in code with backendconnection*/

@WebServlet("/LogInCode")
public class LogInCode extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		String umail=req.getParameter("em");
		String upas=req.getParameter("pwd");
		System.out.println(umail+" "+upas);
		
	
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="select mail from advancejavaonline.usersinfo where mail=? ";
		
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement=connection.prepareStatement(query);
		
			
			
			preparedStatement.setString(1,umail);
			
			/*To print on the broswer*/
			PrintWriter printWriter=resp.getWriter();
			printWriter.println(umail+" "+upas);
			
			ResultSet resultset=preparedStatement.executeQuery();
			if(resultset.next())
			{
				
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