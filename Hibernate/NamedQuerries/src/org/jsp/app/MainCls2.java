package org.jsp.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MainCls2 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory Factory=Persistence.createEntityManagerFactory("Has_a_RelationShip");
		EntityManager manager=Factory.createEntityManager();
		manager.getTransaction().begin();
		
		//wife
		wife w1=new wife();
		w1.se
		
		
		
		
		
		manager.persist();
		
		manager.getTransaction().commit();
	}
}
