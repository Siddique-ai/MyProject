package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_wtit_Xple_attributes  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://en-gb.facebook.com/");
		WebElement mail= driver.findElement(By.xpath("//input[@id='pass'][@class='inputtext _55r1 _6luy _9npi']"));
		mail.sendKeys("hiiiii");
		 
		 
		  
	}

}









 





 



 