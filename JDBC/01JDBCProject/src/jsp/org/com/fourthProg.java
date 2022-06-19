package jsp.org.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fourthProg 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="select * from advancejavaonline.eshu where (Num=29) ";
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			Statement statement=connection.createStatement();
			
			ResultSet resultset=statement.executeQuery(query);
			
			if(resultset.next())
			{
				String sname=resultset.getString("Name");
				String snum=resultset.getString("Num");
				System.out.println(sname +" " +snum+"");
				
			}
			else
			{
				System.out.println("Error.....");
			}
			
			connection.close();
		} 
		catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
	}
}
