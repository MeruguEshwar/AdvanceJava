package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Maincls 
{
	public static void main(String[] args) 
	{
		String jpql="update Info set Marks=:m where RegNumber between 10 and 50";
		String address="update Info set Address=:m where Name like 's%' ";
		String remove="delete from Info where PhoneNumber like '%0' ";
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("StuInfo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Scanner Scan=new Scanner(System.in);
		
		//work with jpql
		Query query = entityManager.createQuery(remove);
	
		// query.setParameter("m",Scan.next());
		
		//execte query
		query.executeUpdate();
		
		entityManager.getTransaction().commit();
	}
}
