//bike
package jsp.app.com;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Autocls")
public class Autocls extends HttpServlet 
{	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NamedQuerries");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createNamedQuery("bk");
		
		
		List<Object[]> list = query.getResultList();
		for(Object[] arr : list)
		{
			for(Object o1 : arr)
			{
				System.out.println(o1);
			}
		}
		
		
		manager.getTransaction().commit();
	}
	
}
