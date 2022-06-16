package jsp.org.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Support
{
public static void main(String[] args) {
	
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	
	String query1="insert into advancejava.actconnection values(?,?,?,?,?,?,?)";
	
	
	try {
		Connection connection=DriverManager.getConnection(url);
		
		PreparedStatement preparedStatement=connection.prepareStatement(query1);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Customer Name: ");
		String ucname=scanner.next();
		preparedStatement.setString(1, ucname);
		
		System.out.println("Enter the Customer Email: ");
		String ucmail=scanner.next();
		preparedStatement.setString(2, ucmail);
		
		System.out.println("Enter the Mobile Number: ");
		String umnumber=scanner.next();
		preparedStatement.setString(3, umnumber);
		
		System.out.println("Select the Type Of Broadband:[pre/post] ");
		String ubband=scanner.next();
		preparedStatement.setString(4, ubband);
		
		System.out.println("Select the Type of Scheme Name:[Local/Std/FullTalkTime] ");
		String usname=scanner.next();
		preparedStatement.setString(5, usname);
		
		System.out.println("Provide the Connection Duration: ");
		int ucd=scanner.nextInt();
		preparedStatement.setInt(6, ucd);
		
		double totalCost =monthlyCost(ubband,usname,ucd);
		preparedStatement.setDouble(7, totalCost);
		
		preparedStatement.executeUpdate();
		System.out.println("The Total Monthly Rental Cost is: "+totalCost);
		
		connection.close();
		
	}
	catch (SQLException e) {
		
		e.printStackTrace();
	}
}


public static double monthlyCost (String typeBroadband,String schemename,int duration)
{
	Scanner scan=new Scanner(System.in);
	String Type=scan.next();
	String s1= "schemename";
	double totalcost = 0.0;
	
	if(schemename == "pre")
	{
		if(schemename == "Local")
		{
			totalcost = (duration * 200)+75;             problem sloved  okkk
			
		}
		else if(schemename == "STD")
		{
			totalcost=(duration * 350)+75;
		}
		else if(schemename == "FullTalkTime")
		{
			totalcost=(duration * 500)+75;
		}
	}
	else if(schemename == "post")
	{
		if(schemename == "Local")
		{
			totalcost = (duration * 200)+150;
		}
		else if(schemename == "STD")
		{
			totalcost=(duration * 350)+150;
		}
		else if(schemename == "FullTalkTime")
		{
			totalcost=(duration * 500)+150;
		}
	}
	return totalcost;
}
}