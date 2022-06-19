package jsp.app.com;

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
		//hus
		husband h1=new husband();
		h1.setName("Nani");
	    h1.setMail("merugueshwar93@gmail.com");
			
		
		//wife
		wife w1=new wife();
		w1.setName("mammu");
		w1.setPhoneNumber("6300773472");
		w1.setHname(h1);
		
		
		
		manager.persist(w1);
		
		manager.getTransaction().commit();
	}
}
