

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	
	WebDriver driver;
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement login;
 
    public Home(WebDriver driver) {
   	 this.driver=driver;
   	 PageFactory.initElements(driver, this);
    }
   	 public void typeusername() {
   		username.sendKeys("Admin");
   	 }


   	 public void typepasswor() {
   		password.sendKeys("admin123");
   	 }

   	 public void Clickonllogin() {
   		login.click();
   		//below line added for git purpose
   		login.click();
   	 }

}
