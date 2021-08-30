 
package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_with_AndOr  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://en-gb.facebook.com/r.php");
		WebElement mail= driver.findElement(By.xpath("//input[ @class='inputtext _58mg _5dba _2ph-' and @id='u_0_n_RA']"));
		mail.sendKeys("hiiiii");
		 
		 
		  
	}

}









 





 



 