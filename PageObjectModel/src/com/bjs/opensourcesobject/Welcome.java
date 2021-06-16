package com.bjs.opensourcesobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {

	WebDriver driver;
	
	By logout=By.linkText("Sign out");
	 public Welcome(WebDriver driver) {
    	 this.driver=driver;
     }
	 
	 public void Logout() {
		 driver.findElement(logout).click();
	 }
	 
}
