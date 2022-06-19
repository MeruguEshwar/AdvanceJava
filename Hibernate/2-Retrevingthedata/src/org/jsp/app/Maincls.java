package org.jsp.app;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Maincls extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("RetrivingData");
		
		EntityManager manager=factory.createEntityManager();
		
		manager.getTransaction().begin();
		

		String carnum=req.getParameter("CarNo");
		
		RetrivingData enani = manager.find(RetrivingData.class,carnum);
		String carnum1 = enani.getCarNumber();
		double carprise = enani.getCarPrise();
		String carclr = enani.getCarColour();
		
		
		ServletContext context = req.getServletContext();
		context.setAttribute("ca",carnum1);
		context.setAttribute("ac",carprise);
		context.setAttribute("nn",carclr);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("File.jsp");
		
		
		manager.getTransaction().commit();
	}
	
}
