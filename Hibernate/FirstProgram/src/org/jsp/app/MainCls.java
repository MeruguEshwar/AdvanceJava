//Frt Program Create table and store the values
package org.jsp.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainCls 
{
	public static void main(String[] args) 
	{
		//Step-1 Establish the connection
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("FirstProgram");
		
		//Step-2 Create an platform
		EntityManager manager = factory.createEntityManager();
		
		//Start the Transaction
		manager.getTransaction().begin();
		
		//Create entity class object
		CreateTable table=new CreateTable();
		
		//inserting rows into tablle
		table.setStudentName("Eshwar");
		table.setRegNumber(1432101499);
		table.setPhoneNumber(990827227);
		table.setLocation("Bhpl");
		
		
		//to save the objects into database
		manager.persist(table);
		
		//End the transaction
		manager.getTransaction().commit();
	}
}
