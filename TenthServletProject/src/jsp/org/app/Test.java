/*Convert rup to dollar*/

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
		urlPatterns = { "/Test" }, 
		initParams = { 
				@WebInitParam(name = "ty", value = "70")
		})
public class Test extends GenericServlet {
	private static final long serialVersionUID = 1L;
	double equi;
    public Test() 
    {
        super();
       
    }

	public void init(ServletConfig config) throws ServletException 
	{
		String equivalueGivenByProgrammer = config.getInitParameter("ty");
		 equi = Double.parseDouble(equivalueGivenByProgrammer);
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		// Fetch date from html file
		String s1 = request.getParameter("d1");
		double em = Double.parseDouble(s1);
		double indianrupee = em * equi;
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println(indianrupee);
		
	}

}
