package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorTagId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement pass = driver.findElement(By.cssSelector("input#email"));
		pass.sendKeys("Siddique");
		
		
		
	}

}

//		WebElement pass = driver.findElement(By.cssSelector("input[id='email']"));
 
//WebElement pass = driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy"));