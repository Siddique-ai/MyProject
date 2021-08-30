package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shadi.com/");
		//identify drop down
		WebElement dropdown = driver.findElement(By.id("ddlEducation"));
		//create object
		Select s = new Select(dropdown);
	//	s.selectByIndex(3);
		s.selectByValue("3");
		//s.selectByVisibleText("High School");
	}

}
