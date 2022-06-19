package jsp.org.app;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/person1")
public class person1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response, String Query) throws ServletException, IOException 
	{
		String upgh=request.getParameter("ph");
		String uname=request.getParameter("nm");
		String uweht=request.getParameter("we");
		
		double weight = Double.parseDouble(uweht);
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JDBC_JPQL");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		
		String jpql="Insert into person1 values(:ab,:bc,:cd)"
		
		Query 
				
		query.executeupdate();
		manager.getTransaction().commit();
	}

}
