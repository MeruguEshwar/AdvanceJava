package jsp.org.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/maincls")
public class maincls extends HttpServlet 
{	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		doGet(req, resp);
			
		int upin=Integer.parseInt(req.getParameter("pin"));
		String ucn=req.getParameter("cn");
		double uja=Double.parseDouble(req.getParameter("ja"));
		double ufe=Double.parseDouble(req.getParameter("fe"));
		double uma=Double.parseDouble(req.getParameter("ma"));
		double uap=Double.parseDouble(req.getParameter("ap"));
		double umy=Double.parseDouble(req.getParameter("my"));
		double uju=Double.parseDouble(req.getParameter("ju"));
		double ujul=Double.parseDouble(req.getParameter("jul"));
		double uau=Double.parseDouble(req.getParameter("au"));
		double use=Double.parseDouble(req.getParameter("se"));
		double uoc=Double.parseDouble(req.getParameter("oc"));
		double uno=Double.parseDouble(req.getParameter("no"));
		double ude=Double.parseDouble(req.getParameter("de"));
		
		String data=upin +","+ ucn +","+ uja +","+ ufe +","+ uma +","+ uap +","+ umy +","+ uju +","+ ujul +","+ uau +","+ use +","+ uoc +","+ uno +","+ ude;
		
		File fw=new File("read.txt");
		fw.createNewFile();
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("frt.html");
		dispatcher.include(req, resp);
	}

}
