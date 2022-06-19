package jsp.org.app;

import java.util.Scanner;

import javax.persistence.EntityManagerFactory;

public class MainCls2 
{
	public static void main(String[] args) 
	{
		
				System.out.println("Enter 1 to select the person details");
				System.out.println("Enter 2 to insert the person details");
				System.out.println("Enter 3 to update the person details");
				System.out.println("Enter 4 to delete the person details");
				
				Scanner scan=new Scanner(System.in);
				int choice=scan.nextInt();
				
				CleanCode cca=new CleanCode();
				
				if(choice==1)
				{
					cca.select();
				}
				else if(choice==2)
				{
					cca.insert();
				}
				else if(choice==3)
				{
					cca.update();
				}
				else if(choice==4)
				{
					cca.delete();
				}
				else
				{
					System.out.println("Out of range....");
				}
			
		
	}
}
