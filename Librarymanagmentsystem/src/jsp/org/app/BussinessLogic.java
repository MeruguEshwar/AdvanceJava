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
				
				String query="select * from advancejavaonline.librarry";
		
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
				 
					if(resultset.next())
					{
						String query2="insert advancejavaonline.librarry into values(?,?,?,?,?)";
						
						PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
			
							if(choice==1)/*inserted*/
							{
								System.out.println("Add Book Details");
						
								System.out.println("1.BookTitle");
								int booktitle = scanner.nextInt();
								preparedStatement2.setInt(1,booktitle);
								preparedStatement2.executeUpdate();
							
								System.out.println("2.BookAuthoor");
								int BookAuthoor = scanner.nextInt();
								preparedStatement2.setInt(2,BookAuthoor);
								preparedStatement2.executeUpdate();
						
						
								System.out.println("3.Bookedititon");
								int Bookedititon = scanner.nextInt();
								preparedStatement2.setInt(3,Bookedititon);
								preparedStatement2.executeUpdate();
						
						
								System.out.println("4.Bookprise");
								int Bookprise = scanner.nextInt();
								preparedStatement2.setInt(4,Bookprise);
								preparedStatement2.executeUpdate();
						
						
								System.out.println("5.Booktype");
								int booktype = scanner.nextInt();
								preparedStatement2.setInt(5,booktype);
								preparedStatement2.executeUpdate();
						
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
					
					
					
					
								if(resultset.next())
								{
									String query3="select * from advancejavaonline.librarry where booktitle=?";
									PreparedStatement preparedStatement3 = connection.prepareStatement(query3);
									
									else if(choice == 2)/*Searched*/
									{
										System.out.println("Book is Searched successfully");
										int Search = scanner.nextInt();
										preparedStatement3.setInt(1,Search);
										preparedStatement3.executeQuery();
									}
					
							

									
									if(resultset.next())
									{
										String query4="update advancejavaonline.librarry where booktitle=? and NewAddition=?";
						
										PreparedStatement preparedStatement4 = connection.prepareStatement(query4);
										else if(choice==3)/*update*/
										{
											System.out.println("******UpdateBook Details*******");
											System.out.println("1.Book Title");
											int updatebook = scanner.nextInt();
											preparedStatement4.setInt(1, updatebook);
											preparedStatement4.executeUpdate();
									
											System.out.println("2.New Addition");
											int NewAddition = scanner.nextInt();
											preparedStatement4.setInt(2,New Addition);
											preparedStatement4.executeUpdate();
									
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
						
					
			
										if(resultset.next())
										{
											String query5="update advancejavaonline.librarry where booktitle=? and NewAddition=?";
											PreparedStatement preparedStatement4 = connection.prepareStatement(query4);
											
					
											else if(choice==4)/*delete*/
											{
													System.out.println("Book was Removed Successfully");
													int Removebook = scanner.nextInt();
													preparedStatement4.setInt(1, Removebook);
													preparedStatement4.executeUpdate();
											}
										}
									}
								}
							}
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
			
			
                   catch (SQLException e) 
				   {
                    	  e.printStackTrace();
				   }
			}
}
		


