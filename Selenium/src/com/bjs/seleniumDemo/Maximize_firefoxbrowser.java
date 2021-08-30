package com.bjs.seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximize_firefoxbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.chrome.driver ", "C:\\Selenium Componenet\\chromedriver.exe");
		FirefoxDriver    driver=new FirefoxDriver();
	driver.manage().window().maximize(); 
	
	}
}

 




 