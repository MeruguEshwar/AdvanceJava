package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Program3 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="select * from advjavaonline.studentinfo where regNumber in('1EC67','sathwik',95.99)";
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Step-1");
			
			Statement statement = connection.createStatement();
			System.out.println("step-2");
			
		    ResultSet resultSet = statement.executeQuery(query);
			System.out.println("Step-3");
			
			while(resultSet.next())
			{
				String rnum = resultSet.getString("regNumber");
				String sname = resultSet.getString("studentName");
				double smarks = resultSet.getDouble("marks");
				System.out.println(rnum+" "+sname+" "+smarks);
			}
			
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
