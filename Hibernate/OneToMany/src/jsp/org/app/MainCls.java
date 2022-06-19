package jsp.org.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class MainCls 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("OneToMany");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		
		College c1=new College();
		c1.setClgName("CITS");
		c1.setClgCode("143L");
		c1.setClgAddress("HNK");
		
		College c2=new College();
		c2.setClgName("WITS");
		c2.setClgCode("1432L");
		c2.setClgAddress("WGL");
		
		College c3=new College();
		c3.setClgName("KITS");
		c3.setClgCode("14321L");
		c3.setClgAddress("NSPT");
		
		List<College> list=new ArrayList<College>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		Univerciy uni=new Univerciy();
		uni.setUniName("KU University");
		uni.setUniCode("506169");
		uni.setUniAddress("HYD");
		uni.setList(list);
		
		manager.persist(uni);
		
		manager.getTransaction().commit();
	}
}
