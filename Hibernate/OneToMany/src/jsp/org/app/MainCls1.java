package jsp.org.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainCls1 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("OneToMany");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		
		BoyFrnd b1=new BoyFrnd();
		b1.setName("SaiRam");
		b1.setPhoneNumber("910023412");
		b1.setAge(24);
		
		BoyFrnd b2=new BoyFrnd();
		b2.setName("Sai");
		b2.setPhoneNumber("91289732");
		b2.setAge(23);
		
		
		List<BoyFrnd> list=new ArrayList<BoyFrnd>();
		list.add(b1);
		list.add(b2);
		
		
		GirlFrnd g1=new GirlFrnd(); 
		g1.setName("Laddu");
		g1.setPhoneNumber("9848032919");
		g1.setAge(20);
		g1.setList(list);
		
		manager.persist(g1);
		
		manager.getTransaction().commit();
	}
}
