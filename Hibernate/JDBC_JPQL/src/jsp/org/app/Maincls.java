package jsp.org.app;

import java.util.Scanner;

public class Maincls 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter 1 to select the person details");
		System.out.println("Enter 2 to insert the person details");
		System.out.println("Enter 3 to update the person details");
		System.out.println("Enter 4 to delete the person details");
		
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		
		if(choice==1)
		{
			BusinessLogic1.select();
		}
		else if(choice==2)
		{
			BusinessLogic1.InsertDeatils();
		}
		else if(choice==3)
		{
			BusinessLogic1.updateDetails();
		}
		else if(choice==4)
		{
			BusinessLogic1.DeletetDeatils();
		}
		else
		{
			System.out.println("Out of range....");
		}
	}
}
