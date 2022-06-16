package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class program7 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query = "select name from advancejavaonline.usersinfo where PhoneNumber=?";
		
		 try 
		 {
			Connection connection = DriverManager.getConnection(url);
			
			PreparedStatement preparedstatement = connection.prepareStatement(query);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter phoneNumber.....");
			String uphn=scan.next();
			preparedStatement.setString(1,uph);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				System.out.println("Registraction successful....");
			}
			else
			{
				System.out.println("Try again....");
			}
			
			connection.close();
		 } 
		 catch (SQLException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		
	}
}
