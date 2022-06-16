/*WAp to create registraction page with help of database*/

package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program6 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query = "select name from advancejavaonline.usersinfo where PhoneNumber=? and Password= ?";
		
		try
		{
			Connection connection = DriverManager.getConnection(url);
			
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("enter phoneNumber...");
			String ph=scan.next();
			preparedStatement.setString(1,ph);
			
			System.out.println("Enter password......");
			String pwd = scan.next();
			preparedStatement.setString(2, pwd);
			
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
