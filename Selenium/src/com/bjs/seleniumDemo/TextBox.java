package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/admin/Desktop/Selenium%20files/text.html");
		 WebElement un = driver.findElement(By.xpath("/html/body/input[1]"));
		 un.sendKeys("siddique");
		 WebElement password= driver.findElement(By.xpath("/html/body/input[2]"));
		 password.sendKeys("umar");
	}

}
