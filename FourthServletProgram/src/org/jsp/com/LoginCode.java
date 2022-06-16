/* Front end html login page o/p to c the broswer*/
package org.jsp.com;
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

@WebServlet("/LoginCode")
public class LoginCode extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		/* to show the o/p on console*/
		String uEmail = req.getParameter("em");
		String upassword = req.getParameter("pwd");
		System.out.println(uEmail+" "+upassword);
		
		/* to show the o/p on broswer*/
		PrintWriter printWriter = res.getWriter();
		printWriter.println(uEmail+" "+upassword);
	}

}
