package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleKeyboardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		Actions a = new Actions(driver);
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("bjshub").pause(2000).sendKeys(Keys.ENTER).build().perform();
	}

}
