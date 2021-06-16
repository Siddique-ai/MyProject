package com.bjs.opensourcesobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	WebDriver driver;
	
     By signin =By.linkText("Sign in");
     public Home(WebDriver driver) {
    	 this.driver=driver;
     }
    	 public void clickOnSignin() {
    		 driver.findElement(signin).click();
    	 }
     }

