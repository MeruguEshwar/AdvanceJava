/*Usre login to database */
package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program2 
{
	public static void main(String argv[])
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query = "insert into advancejavaonline.usersinfo values(?,?,?,?)";
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter user name");
			String uname=scan.next();
			preparedStatement.setString(1,uname);
			
			System.out.println("Enter phonenumber");
			String uphnnumber=scan.next();
			preparedStatement.setString(2,uphnnumber);
			
			
			System.out.println("Enter mail");
			String umail=scan.next();
			preparedStatement.setString(3,umail);
			
			
				System.out.println("Enter Password");
				String upass = scan.next();
				preparedStatement.setString(4,upass);
				
			
				System.out.println("Enter Conform Password");
				String uconformpass = scan.next();
			
				if(upass.equals(uconformpass))
				{
					System.out.println("registration successfully..");
						
				}
				else
				{
					
					System.out.println("Pass wrong again!!!....retry again");
					
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
