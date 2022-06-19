package jsp.app.com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update 
{
	public static void main(String[] args) 
	{
	
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	
		String query="update advancejavaonline.eshu set Name=? where Num=29 ";
	
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("s1");
			
			CallableStatement callableStatement=connection.prepareCall(query);
			System.out.println("s2");
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter new name");
			String uname=scan.next();
			callableStatement.setString(1,uname);
			
			callableStatement.executeUpdate();
			System.out.println("s4");
			
			connection.close();
			System.out.println("s5");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
		
}
