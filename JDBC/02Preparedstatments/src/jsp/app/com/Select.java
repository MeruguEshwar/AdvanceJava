package jsp.app.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Select 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query="select * from  advancejavaonline.eshu  where Name=? ";
		
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("s1");
			
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			System.out.println("s2");
			
			/*
			 * String uname=resultset.getString(); 
			 * preparedStatement.setString(1,uname);
			 */
			System.out.println("Enter the name...");
			Scanner scan=new Scanner(System.in);
			String uname=scan.next();
			preparedStatement.setString(1,uname);
			
			ResultSet resultset=preparedStatement.executeQuery();
			System.out.println("s3");
			
			if(resultset.next())
			{
				String sname=resultset.getString("Name");
				String snum=resultset.getString("Num");
				System.out.println(sname +" " +snum+"");
				System.out.println("Print Successfull.....");
			}
			else
			{
				System.out.println("UnSuccessfull.....");
			}
			
			connection.close();
			System.out.println("s4");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
