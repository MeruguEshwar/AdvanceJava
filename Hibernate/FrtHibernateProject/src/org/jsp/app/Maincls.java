package org.jsp.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Maincls extends Httpservlet
{
	public static void main(String[] args) 
	{
		dopost
	
	//step-1[Establishing the connection]
	EntityManagerFactory factory =  Persistence.createEntityManagerFactory("FrtHibernateProject");
	
	//step-2[Create the platform]
	EntityManager manager = factory.createEntityManager();
	
	//start the Transaction
	manager.getTransaction().begin();
	
	
	
	String enani=req.getParameter("Number");
	
	Nani1 nani = manager.find(Nani1.class,StudentName);
	String studentname = nani.getStudentName();
	int marks = nani.getMarks();
	int regnumber = nani.getRegnumber();
	
	
	
	ServletContext context = req.getServletContext();
	context.setAttribute("ca",studentname);
	context.setAttribute("mm",marks);
	context.setAttribute("nn",regnumber);
	
	
	//To save object into database
	manager.persist(nani);
	
	//to end transaction
	manager.getTransaction().commit();
	}
}
