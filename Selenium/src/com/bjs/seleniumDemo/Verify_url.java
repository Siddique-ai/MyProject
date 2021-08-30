package com.bjs.seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_url {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.chrome.driver ", "C:\\Selenium Componenet\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	String url="http://www.gmail.com/";
	 driver.get(url);
	 
	String eurl="https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	if(eurl.equalsIgnoreCase(aurl))
	{
    System.out.println("pass"); 
	}
	else {
		System.out.println("fail"); 
			
	}
	}

}









 