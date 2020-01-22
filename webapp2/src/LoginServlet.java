

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class LoginServlet extends HttpServlet {
	String user,pass;
	public void init()
	{
		System.out.println("inside init method");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		//out.println("username"+" "+user+" "+"password"+" "+pass);
		request.setAttribute("user",user);
		if(user.equals("man")&&pass.equals("man"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
			//out.println("success");
			//out.println("email"+getServletContext().getInitParameter("email"));
			response.sendRedirect("servlet2?user="+user);
			
		}
		else
		{
			response.sendRedirect("home.html");//redirecting to login page
			out.println("fail");
		}
		System.out.println("inside service method");
		
		
	}
	public void destroy()
	{
		System.out.println("inside destroy method");
	}

}
