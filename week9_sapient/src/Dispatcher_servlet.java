

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.core.ApplicationContext;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet")
public class Dispatcher_servlet extends HttpServlet  {

    /**
     * Default constructor. 
     */
    public Dispatcher_servlet() {
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = request.getRequestURI().substring(request.getContextPath().length());
		switch (url) {
		 case "/getEmp" :
				response.getWriter().append("you are at /getEmp");

		      break;
		   case "/getCustomer" :
				response.getWriter().append("you are at /getCustomer");

		      break;
		   case "/getProducts" :
				response.getWriter().append("you are at /getProducts");

			      break;
			 
		   default :
				response.getWriter().append("error");
			      break;

		}
		
	}

}
