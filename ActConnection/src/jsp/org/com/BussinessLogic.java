package jsp.org.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BussinessLogic {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";

		String query = "insert into advancejavaonline.actconnection values (?,?,?,?,?,?,?)";
		try {
			Connection connection = DriverManager.getConnection(url);

			PreparedStatement preparedStatement = connection.prepareStatement(query);

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Customer Name...");
			String CustomerName = scan.next();
			preparedStatement.setString(1, CustomerName);

			System.out.println("Enter Customer Email...");
			String CustomerMail = scan.next();
			preparedStatement.setString(2, CustomerMail);

			System.out.println("Enter Customer MobileNumber...");
			String CustomerMobileno = scan.next();
			preparedStatement.setString(3, CustomerMobileno);

			System.out.println("Enter Type Of BroadBand[Pre/Post]");
			String TypeOfBroadBand = scan.next();
			preparedStatement.setString(4, TypeOfBroadBand);

			System.out.println("Enter scheme Name[Local/STD/FullTalkTime]");
			String SchemeName = scan.next();
			preparedStatement.setString(5, SchemeName);

			System.out.println("Enter CustomerDuration");
			int CustomerDuration = scan.nextInt();
			preparedStatement.setInt(6, CustomerDuration);

			double totalCost = monthlyCost(TypeOfBroadBand, SchemeName, CustomerDuration);
			preparedStatement.setDouble(7, totalCost);

			preparedStatement.executeUpdate();
			System.out.println("The Total Monthly Rental Cost is: " + totalCost);

			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static double monthlyCost(String TypeOfBroadband, String schemetype, int Duration) 
	{
		double totalCost = 0.0;
		switch (TypeOfBroadband) 
		{
		case "pre":
			switch (schemetype) 
			{
			case "Local":
			case "local":
				totalCost = (Duration * 200) + 75;
				break;

			case "STD":
			case "std":
				totalCost = (Duration * 350) + 75;
				break;

			case "FullTalkTime":
			case "fulltalktime":
				totalCost = (Duration * 500) + 75;
				break;
			}
			break;                                      
		case "post":
			switch (schemetype) 
			{
			case "Local":
			case "local":
				totalCost = (Duration * 200) + 150;
				break;

			case "STD":
			case "std":
				totalCost = (Duration * 350) + 150;
				break;

			case "FullTalkTime":
			case "fulltalktime":
				totalCost = (Duration * 500) + 150;
				break;
			}

			break;
		}
		return totalCost;
	}
}
