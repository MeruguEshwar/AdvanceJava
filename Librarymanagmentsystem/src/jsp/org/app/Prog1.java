package jsp.org.app;

public class Prog1 
{
	package jsp.org.app;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class BussinessLogic {

			public static void main(String[] args) 
			{
					String url="jdbc:mysql://localhost:3306?user=root&password=12345";
					
					String query="select * from advancejavaonline.library";
			
				try 
				{
						Connection connection=DriverManager.getConnection(url);
					
						PreparedStatement preparedStatement=connection.prepareStatement(query);
			       
						
			
						Scanner scanner=new Scanner(System.in);
						System.out.println("Enter 1 to AddBook");
						System.out.println("Enter 2 to SearchBook");
						System.out.println("Enter 3 to UpdateBook");
						System.out.println("Enter 4 to RemoveBook");
						System.out.println("enter u r choice.....");
						int choice=scanner.nextInt();
						
						ResultSet resultset = preparedStatement.executeQuery();
					 
						if(resultset.nextInt())
						{
							String query2="insert table tablename into values()";
							
							PreparedStatement preparedStatement2 = connection.prepareStatement(query2) 
						}
						if(choice==1)/*inserted*/
						{
							System.out.println("Add Book Details");
							System.out.println("1.BookTitle");
							preparedStatement2.setInt(1,BookTitle);
							System.out.println("2.BookAuthoor");
							System.out.println("3.Bookedititon");
							System.out.println("4.Bookprise");
							System.out.println("5.Booktype");
							int book=scanner.nextInt();
							if(book == 1)
							{
								System.out.println("Book title is added");
							}
							else if(book == 2)
							{
								System.out.println("Book author is added");
							}
							else if(book == 3)
							{
								System.out.println("Book addition is added");
							}
							else if(book ==4)
							{
								System.out.println("BookPrise is added");
							}
							else if(book == 5)
							{
								System.out.println("Book type is added.");
							}
							else
							{
								System.out.println("Out Of Range.....");
							}
						}
						else if(choice == 2)/*Searched*/
						{
							 System.out.println("Book is Searched successfully");
						}
					 
						else if(choice==3)/*update*/
						{
							 System.out.println("******UpdateBook Details*******");
							 System.out.println("1.Book Title");
							 System.out.println("2.New Addition");
							 int update=scanner.nextInt();
							 if(update == 1)
							 {
								 System.out.println("Book title is added successfully!!");
							 }
							 else if(update == 2)
							 {
								 System.out.println("New addititon was added successfully!!");
							 }
						 }
					 
					 
						 else if(choice==4)/*delete*/
						 {
						 	System.out.println("Book was Removed Successfully");
						 }
					 
						 System.out.println("Do you wish to continue??(Y/N)");
						 char ch=scanner.next().charAt(0);
						 if(ch=='Y'||ch=='y')
						 {
							 main(args);
						 }
						 else
						 {
							 System.exit(0);
						 }
				}
	                   catch (SQLException e) 
					   {
	                    	  e.printStackTrace();
					   }
				}
	}
			



}
