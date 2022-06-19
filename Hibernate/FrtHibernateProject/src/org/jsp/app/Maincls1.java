package org.jsp.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Maincls1 extends HttpServelet
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("FrtHibernateProject");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		CreateTable c1=new CreateTable();
		
		
		manager.getTransaction().commit();
	}
}
