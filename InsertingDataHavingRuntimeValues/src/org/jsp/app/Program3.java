/*User login page vth */
package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program3 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="update advancejavaonline.usersinfo set password='7654' where phonenumber='9393529478' ";
		try 
		{
			Connection connection = DriverManager.getConnection(url);
		
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
					
			Scanner scan = new Scanner(System.in);
			
				System.out.println("Enter UserName...");
				String uname=scan.next();
			
				System.out.println("Enter phonenumber");
				String uphnnumber=scan.next();
				
				
				System.out.println("Enter mail");
				String umail=scan.next();
				
				
				int count=0;
				for(int i=0;i<3;i++)
				{
						System.out.println("Enter Password");
						String upass = scan.next();
					
				
			
						System.out.println("Enter Conform Password");
						String uconformpass = scan.next();
						
						
						if(upass.equals(uconformpass))
						{
							System.out.println("registration successfully..");
						
						}
						else
						{
							System.out.println("Pass wrong!!!....retry again");
							count++;
							if(count==3)
							{
								System.out.println("Maximum time reached....");
								System.out.println("Forgot the password....");
								
								System.out.println("Enter phone number (or) mail (or)...");
								String fphn=scan.next();
								
								System.out.println("Enter Passward...");
								String fpass=scan.next();
								
								System.out.println("Enter ConformPassward...");
								String fConformpass=scan.next();
								
								if(fpass.equals(fConformpass))
								{
									System.out.println("Successfully...");
								}
								else
								{
									System.out.println("Tryagain...");
								}
								break;
								
							}
							else
							{
								System.out.println();
							}
						}
				System.out.print(" ");
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
