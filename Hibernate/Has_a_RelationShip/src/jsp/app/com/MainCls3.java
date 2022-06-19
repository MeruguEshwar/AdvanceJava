package jsp.app.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainCls3 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory Factory=Persistence.createEntityManagerFactory("Has_a_RelationShip");
		EntityManager manager=Factory.createEntityManager();
		manager.getTransaction().begin();
		
		//Schloership
		ScholerShip s2=new ScholerShip();
		s2.setRefNum(143);
		s2.setType("Postmatric");
		
		//Studdent
		Student s1=new Student();
		s1.setName("Eshu");
		s1.setId("ABC123");
		s1.setSch(s2);
		
		
		manager.persist(s1);
		
		manager.getTransaction().commit();
	}
}
