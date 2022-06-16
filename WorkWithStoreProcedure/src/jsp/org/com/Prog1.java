package jsp.org.com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Prog1 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String invokeSP="{call advancejavaonline.frtSP()}";/*Read from the values of sqlyog by hardcoded values*/
		
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Step-1");
			
			CallableStatement callableStatement = connection.prepareCall(invokeSP);
			System.out.println("Step-2");
			
			callableStatement.executeUpdate();
			System.out.println("step-3");
			
			connection.close();
			System.out.println("Step-5");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
