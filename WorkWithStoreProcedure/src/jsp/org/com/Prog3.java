package jsp.org.com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Prog3 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306";
		
		try 
		{
			FileReader reader = new FileReader("dbinfo.props");
			Properties properties = new Properties();
			
			properties.load(reader);
			
			String s1 = properties.getProperty("user");
			System.out.println(s1);
			
			String s2 = properties.getProperty("password");
			System.out.println(s2);
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
