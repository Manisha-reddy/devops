

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servlet1 extends HttpServlet {
	
	String name;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		name=request.getParameter("name");
		HttpSession session=request.getSession();
		session.setAttribute("name", name);
		out.println("<a href='servlet3'>click</a> ");
	}

}
