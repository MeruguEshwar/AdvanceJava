package jsp.org.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CleanCode 
{
	Scanner scan=new Scanner(System.in);
	EntityManager manager;
	public CleanCode()
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JDBC_JPQL");
		manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
	}
	
	
	public void insert()
	{
		Person person=new Person();
		
		person.setPhoneNumber(990827275);
		person.setName("eshwar");
		person.setWeight(60.0);
		
		manager.persist(person);
		manager.getTransaction().commit();
	}
	
	public void select()
	{
		System.out.println("Enter PhoneNumber:....");
		int uPhn=scan.nextInt();
		
		Person person=manager.find(Person.class,uPhn);
		System.out.println(person);
		manager.getTransaction().commit();
	}
	
	public void update()
	{
		System.out.println("enter PhoneNumber...");
		int uphn=scan.nextInt();
		Person person=manager.find(Person.class,uphn);
		
		System.out.println("Enter new weight...");
		double updte=scan.nextDouble();
		person.setWeight(updte);
		manager.getTransaction().commit();
	}
	
	public void delete()
	{
		System.out.println("Enter Phone Number");
		int uphn=scan.nextInt();
		Person person = manager.find(Person.class,uphn);
		manager.remove(person);
		manager.getTransaction().commit();
	}
}
