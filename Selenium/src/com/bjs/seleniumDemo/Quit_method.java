package com.bjs.seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to( "file:///C:/Users/admin/Desktop/Selenium%20files/page1.html");
		
		WebElement link1 = driver.findElement(By.linkText("GOtoPage2"));
		link1.click();
		driver.quit();

	}

}
