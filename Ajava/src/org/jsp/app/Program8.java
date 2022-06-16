/*Wap to create user login and choice of phone number and mail */
package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Program8 
{
	private static final String Email = null;

	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="select name from advancejavaonline.usersinfo where PhoneNumber=? or mail=? and Password=?";
		
        try 
        {
			Connection connection=DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			
			
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Email or PhoneNumber:");
			String phoneNumberOrEmail = scan.next();
			preparedStatement.setString(1,phoneNumberOrEmail);
			preparedStatement.setString(2,phoneNumberOrEmail);
			
			System.out.println("Enter Pass:");
			String pass=scan.next();
			preparedStatement.setString(3,pass);
			
			ResultSet resultSet = preparedStatement.executeQuery();
	
			if(resultSet.next())
			{
				String str=resultSet.getString("name");
				System.out.println("registration successful ");
			}
			else
			{
				System.out.println("retyr again");
				
			}
			
			connection.close();
		} 
        catch (SQLException e) 
        {
			
			e.printStackTrace();
		}	
	}
}

