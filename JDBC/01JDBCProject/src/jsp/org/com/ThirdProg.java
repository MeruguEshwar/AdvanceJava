//Inserting values vth the of statements
package jsp.org.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ThirdProg 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="insert into advancejavaonline.eshu values('Nani',15)";
		
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			System.out.println("s1");
			
			Statement statement=connection.createStatement();
			System.out.println("s-2");
			
			statement.executeUpdate(query);
			System.out.println("s-3");
			
			connection.close();
			System.out.println("s-4");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
