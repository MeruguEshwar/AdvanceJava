package jsp.app.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="insert into advancejavaonline.eshu values(?,?)";
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("s1");
			
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			System.out.println("s2");
			
			Scanner scan=new Scanner(System.in);
			System.out.println("enter name...");
			String uname=scan.next();
			preparedStatement.setString(1,uname);
			
			System.out.println("Enter value");
			String unum=scan.next();
			preparedStatement.setString(2,unum);
			
			preparedStatement.executeUpdate();
			System.out.println("s3");
			
			connection.close();
			System.out.println("s4");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
