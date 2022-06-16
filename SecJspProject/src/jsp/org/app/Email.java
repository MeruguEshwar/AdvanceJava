package jsp.org.app;

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
@WebServlet("/Email")
public class Email extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//Fetching from html
		String umail=req.getParameter("em");
		System.out.println(umail);
		
		//push email into attribute
		ServletContext context = getServletContext();
		context.setAttribute("run",umail);
		
		//JDBC
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="select mail from advancejavaonline.usersinfo where mail=?";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,umail);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("password.jsp");
				requestDispatcher.include(req, resp);
			}
			else
			{
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("mail.html");
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
