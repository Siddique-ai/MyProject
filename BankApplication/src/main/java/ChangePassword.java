

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChangePassword
 */
public class ChangePassword extends HttpServlet {
	 public void service(HttpServletRequest request,HttpServletResponse response) {
		 String newpassword=request.getParameter("NEWPASSWORD");
           HttpSession  session= request.getSession();
                      int accountnumber =(int) session.getAttribute("ACCOUNTNUMBER");
                      Model m=new Model();
                      m.setPassword(newpassword);
                      m.setAccountnumber(accountnumber);
                      boolean status=m.changePassword();
                      if(status==true) {
                    	  try {
							response.sendRedirect("successchangepassword.html");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                      }
                      else
                      {
                    	  try {
							response.sendRedirect("failurechangepassword.html");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                      }
 }
}
