package com.bjs.opensourcesobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	
	By email=By.id("email");
	By password=By.id("passwd");
	By submit=By.id("SubmitLogin");
	
	 public Login(WebDriver driver) {
    	 this.driver=driver;
     }
	 
	 public void email() {
		 driver.findElement(email).sendKeys("ihassan395@gmail.com");
	 }
	 public void pass() {
		 driver.findElement(password).sendKeys("Admin@123");
	 }
	 
	 public void login() {
		 driver.findElement(submit).click();
	 }
	 
	
}
