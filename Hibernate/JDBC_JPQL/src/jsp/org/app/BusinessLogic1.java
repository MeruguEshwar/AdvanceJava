package jsp.org.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BusinessLogic1 
{
	static String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	
	public static void select()
	{
		String sql="select * from advancejavaonline.personDetails where Name=?";
		try
		{
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter person name");
			String pname=scan.next();
			preparedStatement.setString(1,pname);
			
			ResultSet resultset=preparedStatement.executeQuery();
			
			if(resultset.next())
			{
				System.out.println("Name selected successfully");
			}
			else
			{
				System.out.println("Error");
			}
			
			connection.close();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void InsertDeatils()
	{
		String sql="Insert into advancejavaonline.personDetails values (?,?,?)";
		try
		{
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter person name");
			String pname=scan.next();
			preparedStatement.setString(1,pname);
			
			System.out.println("Enter person Weight");
			String pweight=scan.next();
			preparedStatement.setString(2,pweight);
			
			
			System.out.println("Enter person Phone Number");
			String uphn=scan.next();
			preparedStatement.setString(3,uphn);
			
			preparedStatement.executeUpdate();
			
			
			connection.close();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void updateDetails()
	{
		String sql="update advancejavaonline.persondetails  set Weight=? where PhoneNumber=?";
		try
		{
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter person Weight");
			String pweight=scan.next();
			preparedStatement.setString(1,pweight);
			
			System.out.println("Enter person Phone Number");
			String uphn=scan.next();
			preparedStatement.setString(2,uphn);
			
			preparedStatement.executeUpdate();
			
			
			connection.close();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void DeletetDeatils()
	{
		String sql="Delete from advancejavaonline.persondetails where PhoneNumber=?";
		try
		{
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter person Phone Number");
			String uphn=scan.next();
			preparedStatement.setString(1,uphn);
			
			
			preparedStatement.executeUpdate();
			
			
			connection.close();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
