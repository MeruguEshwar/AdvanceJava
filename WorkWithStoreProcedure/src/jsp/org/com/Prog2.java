package jsp.org.com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Prog2 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String invokeSP="{call advancejavaonline.SecondSp(?,?,?,?)}";
		
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			
			CallableStatement callableStatement = connection.prepareCall(invokeSP);
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter Name");
			String sname = scan.next();
			callableStatement.setString(1,sname);
			
			System.out.println("Enter PhoneNumber");
			int phn = scan.nextInt();
			callableStatement.setInt(2,phn);
			

			System.out.println("Enter Mail");
			String mail = scan.next();
			callableStatement.setString(3,mail);
			
			System.out.println("Enter pass");
			int pass = scan.nextInt();
			callableStatement.setInt(4,pass);
			

			
			callableStatement.executeUpdate();
			
			
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
