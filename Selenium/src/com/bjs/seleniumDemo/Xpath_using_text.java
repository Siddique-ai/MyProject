 


package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_using_text  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/admin/Desktop/Selenium%20files/text2.html");
		WebElement path= driver.findElement(By.xpath("//td[text()='Selenium']"));
		path.sendKeys("123");
	
		 
		 
		  
	}

}



















