

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Transfer
 */
public class Transfer extends HttpServlet {
	 public void service(HttpServletRequest request,HttpServletResponse response) {
		 HttpSession session=request.getSession();
		 int accountnumber=(int) session.getAttribute("ACCOUNTNUMBER");
		 String amount=request.getParameter("AMOUNT");
		 String toaccount=request.getParameter("TOACCOUNT");
		 Model m=new Model();
		 m.setAccountnumber(accountnumber);
		boolean status=m.transfer(amount, toaccount);
		if(status==true) {
			try {
				response.sendRedirect("transfersuccess.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			try {
				response.sendRedirect("transferfailure.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 }

}
