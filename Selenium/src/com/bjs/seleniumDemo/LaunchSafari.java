package com.bjs.seleniumDemo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchSafari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver ", "C:\\Selenium Componenet\\geckodriver.exe");
      FirefoxDriver driver=new FirefoxDriver();
	}

}
