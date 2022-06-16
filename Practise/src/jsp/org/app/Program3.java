/*WAP to create the update*/
package jsp.org.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program3 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query = "update nani.mammu set name='c' where regno='456b'";
		try  
		{
			Connection connection = DriverManager.getConnection(url);
			System.out.println("step-1");
			
			Statement statement = connection.createStatement();
			System.out.println("Step-2");
			
			statement.executeUpdate(query);
			System.out.println("Step-3");
			
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
