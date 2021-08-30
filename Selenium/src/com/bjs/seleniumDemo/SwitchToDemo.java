package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/admin/Desktop/Selenium%20files/middle.html");
		WebElement middle = driver.findElement(By.id("mname"));
		middle.sendKeys("Hassan");
		/*//Switch to frame index
		driver.switchTo().frame(0);
		WebElement first = driver.findElement(By.id("fname"));
		first.sendKeys("Imran");
		*/
		/*
		//Switch to frame(id/name)
           driver.switchTo().frame("newname"); 
   		WebElement first = driver.findElement(By.id("fname"));
   		first.sendKeys("Imran");
          */
           //Switch to frame by xpath
          WebElement xpath = driver.findElement(By.xpath("//iframe[@id='newname']"));
          driver.switchTo().frame(xpath);
          WebElement first = driver.findElement(By.id("fname"));
     		first.sendKeys("Imran");
            
            
            
	}

}
