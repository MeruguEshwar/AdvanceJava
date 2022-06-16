package jsp.org.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/GenerateDateAndTime")
public class GenerateDateAndTime extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
		System.out.println(dateformat.format(date));
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("today's Date is:"+date);
				
	}

}
