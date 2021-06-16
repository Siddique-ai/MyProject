package com.bjs.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bjs.orangehrm.Home;
import com.bjs.orangehrm.Login;
import com.bjs.orangehrm.Welcome;
 

public class OrangeHRM {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Home h=new Home(driver);
		h.typeusername();
		h.typepasswor();
		h.Clickonllogin();
		

		Login l=new Login(driver);
		l.clickonmarket();
	 
		
		Welcome w=new  Welcome(driver);
		w.clickonrequest();
	}
}
