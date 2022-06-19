package org.jsp.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Maincls 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Criteria");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		
		//Step-1
		CriteriaBuilder builder=manager.getCriteriaBuilder();
		
		//step-2
		CriteriaQuery<Flight> select = builder.createQuery(Flight.class);
		
		//step-3
		Root<Flight> from=select.from(Flight.class);
		
		Query query=manager.createQuery(select);
		List<Flight> list=query.getResultList();
		System.out.println(list);
		
		manager.getTransaction().commit();
	}
}
