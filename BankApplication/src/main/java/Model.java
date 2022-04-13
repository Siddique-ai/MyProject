import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import oracle.jdbc.driver.OracleDriver;

public class Model {
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet res=null;
	String url="jdbc:oracle:thin:@//localhost:1521/XE";
	String pass="system";
	String user="system";
	private String name;
	private int accountnumber;
	private int balance;
	private String password;
	private String customerid;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	Model()
	{
		try {
			DriverManager.registerDriver(new OracleDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public boolean login()
	{
		String s="SELECT * FROM Bank WHERE customerid=? and PASSWORD=?";
		try {
			pstmt=con.prepareStatement(s);
			pstmt.setString(1, customerid);
			pstmt.setString(2, password);
			res=pstmt.executeQuery();
			if(res.next()==true)
			{
				accountnumber=res.getInt(2);
				return true;
			}
			else
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	
	}
	
	public boolean getBalance1() {
		String s="select * from bank where accountnumber=?";
	try {
		pstmt=	con.prepareStatement(s);
		pstmt.setInt(1, accountnumber);
		res=pstmt.executeQuery();
		if(res.next()==true) {
			balance=res.getInt(3);
			return true;
		}
		else 
			return false;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;

	}
	
	public boolean changePassword() {
		
		String s= "Update bank set password=? where accountnumber=?";
		try {
			pstmt=con.prepareStatement(s);
			pstmt.setString(1,password);
			pstmt.setInt(2, accountnumber);
			int status=pstmt.executeUpdate();
			if(status>0) {
			return true;	
			}
			else 
			{
					return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean transfer(String amount ,String toaccount) {
		String s1="update bank set balance=balance-? where accountnumber=?";
		try {
			pstmt=con.prepareStatement(s1);
			pstmt.setString(1,amount);
			pstmt.setInt(2,accountnumber);
			int value1=pstmt.executeUpdate();
			if(value1>0) {
				String s2 ="update bank set balance=balance+? where accountnumber=?";
				pstmt=con.prepareStatement(s2);
				pstmt.setString(1,amount);
				pstmt.setString(2,toaccount);
				int value2=pstmt.executeUpdate();
				if(value2>0) {

					String s3="insert into getstatement values(?,?,?,?)";
					pstmt=con.prepareStatement(s3);
					pstmt.setInt(1,accountnumber);
					pstmt.setString(2,amount);
					pstmt.setString(3,toaccount);
					Date d = new Date();
					int datee = d.getDate();

					int month = d.getMonth()+1;
					int year = d.getYear()-100;
						String finaldate=datee+"/"+month+"/"+year;
				pstmt.setString(4, finaldate);
				int value3 = pstmt.executeUpdate();
				
					return true;
				}
				else
				{
				return false;	
				}
			}
			 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public ArrayList getStatement()   {
		String s4="select * from getstatement where accountnumber=?";
		
		try {
			pstmt=con.prepareStatement(s4);
			pstmt.setInt(1,accountnumber);
			  res = pstmt.executeQuery();
			  
			  ArrayList a=new ArrayList();
			  int i=1;
			  while(res.next()==true) {

				  int ac1 = res.getInt(1);
				  int am = res.getInt(2);
				  int ac2 = res.getInt(3);
				  String dd = res.getString(4);
				  a.add(i);
				  a.add(ac1);
				  a.add(am);
				  a.add(ac2);
				  a.add(dd);
				  i++;
			  }
			  return a;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
}