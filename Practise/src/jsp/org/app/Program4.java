package jsp.org.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program4 
{
	public static void main(String[] args) 
	{
			
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="insert into advancejavaonline.usersinfo values('Chintu','9393529478','Chintu@123.com','5678')";
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			System.out.println("step-1");
			
			Statement statement = connection.createStatement();
			System.out.println("Step-2");
			
			statement.executeUpdate(query);
			System.out.println("step-4");
					
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
