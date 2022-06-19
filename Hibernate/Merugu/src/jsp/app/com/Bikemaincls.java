package jsp.app.com;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Bikemaincls 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Merugu");
		
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createNamedQuery("bk");
		
		
		query.getParameter("ab");
		
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
