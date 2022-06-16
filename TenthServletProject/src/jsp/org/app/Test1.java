package jsp.org.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;


@WebServlet(
		urlPatterns = { "/Test1" }, 
		initParams = { 
				@WebInitParam(name = "Test1", value = "1.21")
		})
public class Test1 extends GenericServlet 
{
	double equi;
	private static final long serialVersionUID = 1L;
       
    
    public Test1() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException 
	{
		// TODO Auto-generated method stub
		 String equivalueGivenByProgrammer = config.getInitParameter("euros");
		 equi = Double.parseDouble(equivalueGivenByProgrammer);
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String s1 = request.getParameter("euros");
		double em = Double.parseDouble(s1);
		double euro = em * equi;
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println(euro);
	}

}
