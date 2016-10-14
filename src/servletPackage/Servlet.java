package servletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Servlet implementation class Servlet
 * 
 */
@WebServlet(description = "This is a simple servlet", urlPatterns = { "/Servlet2" })
public class Servlet extends HttpServlet implements javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String var1 = request.getParameter("firstVariable");
		String var2 = request.getParameter("secondVariable");
		
		int firstVariable = Integer.parseInt(var1);
		int secondVariable = Integer.parseInt(var2);
		String sum = Integer.toString(firstVariable+secondVariable);
		PrintWriter writer = response.getWriter();
		writer = response.getWriter().append("<html><body>").append(request.getContextPath());
		writer.println("&nbsp;Served at: <br />");
		writer.println("<p>The sum of "+var1+" and "+var2+" is "+sum+"</p></body></html>");
	} 
}
