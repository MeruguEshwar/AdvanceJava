package org.jsp.app;

import java.util.Scanner;

public class Maincls 
{
	public static void main(String[] args) 
	{
		
		
		System.out.println("Enter 1.AddBook");
		System.out.println("Enter 2.SearchBook");
		System.out.println("Enter 3.UpdateBook");
		System.out.println("Enter 4.DeleteBook");
		System.out.println("Enter the values...");
		
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();
		
		
		CleanCodeApproach cca=new CleanCodeApproach();
		if(num==1)
		{
			cca.AddBook();
			System.out.println("BookAdded Successfully...");
		}
		else if(num ==2)
		{
			cca.SearchBook();
			System.out.println("Search Book Successfully...");
		}
		else if(num ==3)
		{
			cca.UpDateBook();
			System.out.println("Updated Book Successfully...");
		}
		else if(num==4)
		{
			cca.RemoveBook();
			System.out.println("Deleted Book Successfully...");
		}
		else
		{
			System.out.println("out of range....");
		}
	}
}
