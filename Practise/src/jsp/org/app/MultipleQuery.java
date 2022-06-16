package jsp.org.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MultipleQuery 
{
	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		
		String query1 = "select * from advancejava.userinfo where PhoneNumber=?";
		
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(query1);
			
			System.out.println("Enter phone number : ");
			Scanner scanner = new Scanner(System.in);
			String phoneNum = scanner.next();
			preparedStatement.setString(1, phoneNum);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				String query2 = "update advancejava.userinfo set Password=? where PhoneNumber=?";
				
				PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
				
				System.out.println("Enter New Password : ");
				String newPass = scanner.next();
				
				System.out.println("Confirm Password : ");
				String confirmNewPass = scanner.next();
				
				if(newPass.equals(confirmNewPass))
				{
					preparedStatement2.setString(1, newPass);
					preparedStatement2.setString(2, phoneNum);
					preparedStatement2.executeUpdate();
					System.out.println("Password Updated...");
					
				}
				else
				{
					System.err.println("Password not matching..");
				}
			}
			else
			{
				System.err.println("Phone Number not found..");
			}
			connection.close();
			scanner.close(); 
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
