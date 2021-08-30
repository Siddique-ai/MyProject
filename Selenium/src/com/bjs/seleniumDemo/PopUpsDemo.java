package com.bjs.seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to( "http://www.echoecho.com/javascript4.htm");
         WebElement alert = driver.findElement(By.name("B1"));
         alert.click();
         
         Alert a = driver.switchTo().alert();
		Thread.sleep(5000);
		a.accept();
        WebElement confirm = driver.findElement(By.name("B2"));
        confirm.click();
        
        Alert c = driver.switchTo().alert();
		Thread.sleep(5000);
		c.dismiss();
		
		WebElement prompt = driver.findElement(By.name("B3"));
		prompt.click();
        
        Alert p = driver.switchTo().alert();
		
		p.sendKeys("OKie enter");
		Thread.sleep(5000);
		String text = p.getText();
		System.out.println(text);
		p.accept();
		
		

	}

}
