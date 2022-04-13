

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Statement
 */
public class Statement extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		HttpSession session=request.getSession();
		int accountnumber=(int) session.getAttribute("ACCOUNTNUMBER");
		Model m=new Model();
		m.setAccountnumber(accountnumber);
		ArrayList al = m.getStatement();
		session.setAttribute("AL", al);
		response.sendRedirect("disp.jsp");
		
	}
}
