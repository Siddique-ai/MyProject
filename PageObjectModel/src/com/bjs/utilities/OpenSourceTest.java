package com.bjs.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bjs.opensourcesobject.Home;
import com.bjs.opensourcesobject.Login;
import com.bjs.opensourcesobject.Welcome;

public class OpenSourceTest {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		Home h=new Home(driver);
		h.clickOnSignin();

		Login l=new Login(driver);
		l.email();
		l.pass();
		l.login();
		
		Welcome w=new  Welcome(driver);
		w.Logout();
	}
}
