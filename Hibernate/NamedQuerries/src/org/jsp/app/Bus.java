
package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Bus 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NamedQuerries");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createNamedQuery("bs");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter bus number : ");
		query.setParameter("bn", scanner.next());
		
		query.executeUpdate();
		System.out.println("Deleted..");
		
		manager.getTransaction().commit();
	}
}
