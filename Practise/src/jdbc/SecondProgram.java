package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SecondProgram 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=1234";
		String query="insert into advancejavaonline.eshu values where name= eshwar and num=9908272275 ";
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}
}
