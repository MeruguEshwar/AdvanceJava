package org.jsp.app;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Bike 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NamedQuerries");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createNamedQuery("b");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter bike number : ");
		query.setParameter("ab", scanner.next());
		
		List<Object[]> list = query.getResultList();
		for(Object[] arr : list)
		{
			for(Object o1 : arr)
			{
				System.out.println(o1);
			}
		}
		
		
		manager.getTransaction().commit();
	}
}
