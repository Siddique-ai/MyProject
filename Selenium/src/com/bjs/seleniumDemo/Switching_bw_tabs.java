
package com.bjs.seleniumDemo;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_bw_tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to( "file:///C:/Users/admin/Desktop/Selenium%20files/page11.html");
		
		WebElement link1 = driver.findElement(By.linkText("GOtoPage22"));
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		link1.click();
		 
		Set<String> allids = driver.getWindowHandles();
		System.out.println(allids);
		/*for(String s:allids) {
			driver.switchTo().window(s);
		}
		*/
		ArrayList  al=new	ArrayList(allids);
		driver.switchTo().window((String) al.get(1));//index in Array list start from 0 so for second page we are puuting 1 as index
		WebElement link2 = driver.findElement(By.linkText("GOtoPage33"));
		link2.click();
		
	}

}
