package jsp.app.com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delete 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="delete from advancejavaonline.eshu where Num=? ";
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("s1");
			
			CallableStatement callableStatement=connection.prepareCall(query);
			System.out.println("s2");
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter num...");
			String unum=scan.next();
			callableStatement.setString(1,unum);
			System.out.println("s3");
			
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
