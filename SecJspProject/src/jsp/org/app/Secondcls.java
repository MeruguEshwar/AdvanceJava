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
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Secondcls")
public class Secondcls extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		ServletContext context = getServletContext();
		String umail= (String) context.getAttribute("run");
		
		//fetching from jsp file
		String upass=req.getParameter("ps");
		
		//JDBC
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="select name from advancejavaonline.usersinfo where mail=? and password=?";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection =DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,umail);
			preparedStatement.setString(2,upass);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				String uname=resultSet.getString("name");
				context.setAttribute("chintu",uname);
				
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("welcome.jsp");
				requestDispatcher.include(req, resp);
			}
			else
			{
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("password.jsp");
				requestDispatcher.include(req, resp);
			}
		}
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
	}
}
