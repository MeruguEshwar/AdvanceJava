package jsp.org.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sixth 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="update advancejavaonline.eshu set Name='chocho' where Num=20 ";
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("s1");
			
			Statement statement=connection.createStatement();
			System.out.println("s2");
			
			statement.executeUpdate(query);
			System.out.println("s3");
			
			connection.close();
			System.out.println("s4");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
