package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CleanCodeApproach 
{
	EntityManager manager;
	Scanner scan=new Scanner(System.in);
	
		public CleanCodeApproach()
		{
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("LibraryManagmentUsingHibernat");
			EntityManager entityManager = factory.createEntityManager();
			entityManager.getTransaction().begin();
		}
		public void AddBook()
		{
			Book obj = new Book();
			
			System.out.println("Enter Book Title");
			obj.setBookTitle(scan.next());
			
			System.out.println("Enter Book Author");
			obj.setBookAuthor(scan.next());
			
			System.out.println("Enter Book Edition");
			obj.setEdition(scan.nextInt());
			
			System.out.println("Enter Book Prise");
			obj.setPrise(scan.nextInt());
			
			System.out.println("Enter Book Type");
			obj.setType(scan.next());
			
			manager.persist(obj);
			close();
		}
		public void SearchBook()
		{
			System.out.println("enter value to Search Book");
			String search=scan.next();
			Book book = manager.find(Book.class,search);
			System.out.println(book);
			close();
			
		}
		public void UpDateBook()
		{
	
			System.out.println("enter value to Update Book");
			String update=scan.next();
			Book book=manager.find(Book.class,update);
			close();
		}
		public void RemoveBook()
		{
			System.out.println("enter value to delete Book");
			String del=scan.next();
			Book book=manager.find(Book.class,del);
			manager.remove(book);
			close();
		}
		public void close()
		{
			manager.getTransaction().commit();
		}
	
}
