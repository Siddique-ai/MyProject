

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Balance
 */
public class Balance extends HttpServlet {
public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
{
	HttpSession session=request.getSession();
	int accountnumber=(int) session.getAttribute("ACCOUNTNUMBER");
	Model m=new Model();
	m.setAccountnumber(accountnumber);
	boolean value =m.getBalance1();
	if(value ==true)
	{
	int balance=m.getBalance();
	session.setAttribute("BALANCE", balance);
	response.sendRedirect("successBalance.jsp");
	}
	else
		response.sendRedirect("failureBalance.html");
}
}