package jsp.org.com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class SecondCls 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="select ename from advancejavaonline.userinfo where mail=abc ";//Example
		try 
		{
			Connection connection=DriverManager.getConnection(url);//Establish the connection
			System.out.println("step-1");
			
			//Create An Platform
			Statement statement=connection.createStatement();//Used to give the values of Hardcoded
			//PreparedStatement preparedStatement=connection.prepareStatement("query");//Used to the run time values
			//CallableStatement callableStatement=connection.prepareCall(query);//Used to both run time and hardCoded values
			System.out.println("step-2");
			
			int resultset=statement.excutequery();//execute the data/sql querys
			System.out.println("step-3");
			
			if(resultset.next())
			{
				System.out.println("succesfull...");
			}
			else
			{
				System.out.println("Unsuccessfull....");
			}
			
			connection.close();//Colse the connection
			System.out.println("step-5");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
