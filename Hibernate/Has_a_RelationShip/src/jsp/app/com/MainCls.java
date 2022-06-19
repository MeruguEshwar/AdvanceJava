package jsp.app.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainCls 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory Factory=Persistence.createEntityManagerFactory("Has_a_RelationShip");
		EntityManager manager=Factory.createEntityManager();
		manager.getTransaction().begin();
		
		//Pasport
		Passport p2=new Passport();
		p2.setPassportNumber("A1234");
		p2.setNumberOfPages(45);
		
		
		//Person
		Person p1=new Person();
		p1.setPersonName("Nani");
		p1.setPersonPhoneNumber("9908272275");
		p1.setPassport(p2);
		
		manager.persist(p1);
		
		manager.getTransaction().commit();
	}
}
