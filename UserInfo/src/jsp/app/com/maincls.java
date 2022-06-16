//Inserting data

package jsp.app.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class maincls 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";

		String query = "insert into advancejavaonline.usersinfo values (?,?,?,?)";
		
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Name...");
			String CustomerName = scan.next();
			preparedStatement.setString(1, CustomerName);
			
			System.out.println("Enter  MobileNumber...");
			String CustomerMobileno = scan.next();
			preparedStatement.setString(2, CustomerMobileno);
			
			System.out.println("Enter Email...");
			String CustomerMail = scan.next();
			preparedStatement.setString(3, CustomerMail);
			
			System.out.println("Enter Pass...");
			String pwd = scan.next();
			preparedStatement.setString(4, pwd);
			
			preparedStatement.executeUpdate();
			System.out.println("step-4");
			
			connection.close();
			System.out.println("step-5");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
