package com.bjs.seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.chrome.driver ", "C:\\Selenium Componenet\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize(); 
	
	}
}

 