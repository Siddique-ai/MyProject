package com.bjs.seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
	WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		
		WebElement marketplace = driver.findElement(By.id("MP_link"));
		marketplace.click();
		
		WebElement request = driver.findElement(By.id("buyBtn1"));
		request.click();
	}

}
