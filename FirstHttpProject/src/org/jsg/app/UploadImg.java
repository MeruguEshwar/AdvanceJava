/* Upload img to the data base */
package org.jsg.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@WebServlet("/UploadImg")
@MultipartConfig(maxFileSize = 134217728)

public class UploadImg extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String uname =req.getParameter("nm");
		Part uimg=req.getPart("fg");
		
		System.out.println(uname+" "+uimg);
		
		//JDBC CODE
		String url= "jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="insert into advancejavaonline.image values(?,?)";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			//Pass the values to place holder
			preparedStatement.setString(1,uname);
			preparedStatement.setBlob(2,uimg.getInputStream());
			
			preparedStatement.executeUpdate();
			connection.close();
			System.out.println("Image saved successfull");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
