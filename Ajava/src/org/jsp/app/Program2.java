package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="update studentinfo.studentinfo set marks=95 where RegNo=174930972";
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Step-1");
			
			Statement statement = connection.createStatement();
			System.out.println("step-2");
			
		    statement.executeUpdate(query);
			System.out.println("Step-3");
			
			connection.close();
			System.out.println("Step-5");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
