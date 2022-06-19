//Demo Program
package jsp.org.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Frtcls 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("step-1");
			
			connection.close();
			System.out.println("step-5");
			
		}
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}
}
