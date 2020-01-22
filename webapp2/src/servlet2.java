

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class servlet2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		//ServletConfig sc=getServletConfig();
	//.	ServletContext sc=getServletContext();
		//. out.println("email"+sc.getInitParameter("email"));
//		out.println("mobile numb"+sc.getInitParameter("Mobile"));
		out.println("hello  "+request.getParameter("user")+"  u r in the page  "+getServletConfig().getServletName());
	//..	out.println("hello  "+request.getAttribute("user")+"  u r in the page  "+getServletConfig().getServletName());

	}

}
