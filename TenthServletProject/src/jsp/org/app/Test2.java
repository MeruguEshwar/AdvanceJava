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

/**
 * Servlet implementation class Test2
 */
@WebServlet(
		urlPatterns = { "/Test2" }, 
		initParams = { 
				@WebInitParam(name = "Nani", value = "89")
		})
public class Test2 extends GenericServlet 
{
	double equi;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Test2() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException 
	{
		// TODO Auto-generated method stub
		String equivalueGivenByProgrammer = config.getInitParameter("Nani");
		 equi = Double.parseDouble(equivalueGivenByProgrammer);
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String s1 = request.getParameter("Nani");
		double em = Double.parseDouble(s1);
		double eurotorup = em * equi;
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println(eurotorup);
	}

}
