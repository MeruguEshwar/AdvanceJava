/*Work with multiple qurries*/
package jsp.org.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prog5 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?username=root&password=12345";
		
		String query="select * from advancejavaonline.studentinfo where phonenumber=?";
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatemnt.executeQuery();
			
			connection.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
