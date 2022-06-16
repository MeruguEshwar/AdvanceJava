package jsp.app.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatingTheData 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";

		String query = "update advancejavaonline.usersinfo set name=? where password=?";
		
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Name...");
			String Name = scan.next();
			preparedStatement.setString(1,Name);
			
			System.out.println("Enter  NewPass...");
			String pwd = scan.next();
			preparedStatement.setString(2,pwd);
			
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
