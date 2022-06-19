package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Train 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NamedQuerries");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createNamedQuery("tn");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the train number..");
		query.setParameter("bc",scan.nextInt());
		
		System.out.println("Enter the train type..");
		query.setParameter("ab",scan.next());
	
		query.executeUpdate();
		
		manager.getTransaction().commit();
	}
}
