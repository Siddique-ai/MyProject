package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/search?q=Infinix%20Hot%2010%20Play%20Infinix%20Hot%2010&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		 
		 
		WebElement xpth= driver.findElement(By.xpath("//div[text()='Infinix Hot 10 Play (Morandi Green, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]"));
		xpth.click();
		 
	}

}


//div[text()='Infinix Hot 10 Play (Morandi Green, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]