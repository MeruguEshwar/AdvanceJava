package jsp.org.com;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Prog4 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306";
		
		try 
		{
			FileReader reader = new FileReader("dbinfo.props");
			Properties properties = new Properties();
			
			properties.load(reader);
			
			Connection connection = DriverManager.getConnection(url,properties);
			System.out.println("Step-1");
			
			connection.close();
			System.out.println("Step-2");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
