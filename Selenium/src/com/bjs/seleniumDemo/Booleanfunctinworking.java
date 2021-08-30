package com.bjs.seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Booleanfunctinworking {

public static void main (String [] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	driver.get("http://www.gmail.com");
//isDisplayed() method returns boolean value either True or False

	Boolean Display = driver.findElement(By.id("identifierNext")).isDisplayed();
//To print the value

	System.out.println("Element displayed is :"+Display);
//isEnabled() method returns boolean value either True or False 

	Boolean Enable = driver.findElement(By.id("identifierNext")).isEnabled();

	System.out.println("Element enabled is :"+Enable);
//Passing value as "softwaretestingmaterial" in the email field

	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("softwaretestingmaterial@gmail.com");
//to click on next button

	driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
//isSelected() method returns boolean value either True or False

	Boolean Select = driver.findElement(By.xpath("//*[@id='PersistentCookie']")).isSelected();

	System.out.println("Element selected is :"+Select);
} 
}