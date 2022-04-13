

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		String customerid=request.getParameter("CUSTOMERID");
		String password=request.getParameter("PASSWORD");
		Model m=new Model();
		m.setCustomerid(customerid);
		m.setPassword(password);
		
		boolean status=m.login();
	int accountnumber=	m.getAccountnumber();
		if(status==true)
			try {
				HttpSession session=request.getSession(true);
				session.setAttribute("ACCOUNTNUMBER", accountnumber);
				response.sendRedirect("successLogin.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			try {
				response.sendRedirect("failureLogin.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
