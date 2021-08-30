package com.bjs.seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_title {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.chrome.driver ", "C:\\Selenium Componenet\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	String url="http://www.gmail.com/";
	driver.get(url); 
	String atitle=driver.getTitle();
	String etitle="Gmail";
	if(etitle.equalsIgnoreCase(atitle))
	{
    System.out.println("pass"); 
	}
	else {
		System.out.println("fail"); 
			
	}
	}

}
