/*WAP to insert the date into the database with the help of eclipse   */

package jsp.org.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="insert into nani.mammu values('b','456','bhpl','456b')";
		
		try 
		{
			 Connection connection = DriverManager.getConnection(url);/* establish the database connection */
			 System.out.println("step-1");
			
			 Statement statement = connection.createStatement();/* create the platform for sql qurries to data base*/
			 System.out.println("step-2");
			
			 statement.executeUpdate(query);/*Execute the query*/
			 System.out.println("step-3");
			
			 connection.close();/*Simply Closee the connections*/
			 System.out.println("Step-5");
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
