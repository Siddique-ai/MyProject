package com.bjs.seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booleanfunction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to( "https://www.cleartrip.com/");
		WebElement roundtrip = driver.findElement(By.xpath("//p[text()='Round trip']"));
		if(roundtrip.isSelected()) {
			System.out.println("Round trip is selected");
		}
		else {
			roundtrip.click();
		}
		
		WebElement returndate = driver.findElement(By.xpath(" //button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900'][2]"));
		if(returndate.isDisplayed()) {
			returndate.sendKeys("Sun, 4 Jul, 2021");
		}
		else {

			System.out.println("Date not selected");
		}

	}

}
