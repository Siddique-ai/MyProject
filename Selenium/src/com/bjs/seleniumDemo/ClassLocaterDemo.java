package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocaterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement class1 = driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
		class1.sendKeys("password");
		
		
		
	}

}
