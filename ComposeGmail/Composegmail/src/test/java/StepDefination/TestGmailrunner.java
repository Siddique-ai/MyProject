package StepDefination;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestGmailrunner {
	WebDriver driver = null;


@Given("There is a users who visits gmail login")
public void there_is_a_users_who_visits_gmail_login() {

	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	driver.manage().window().maximize();
    
}

@Then("Then I navigate to www.gmail.com")
public void then_i_navigate_to_www_gmail_com() {
	driver.get("https://www.gmail.com");
    
}

@Then("I enter siddiquetestingselenium@gmail.com into input field having xpath \\(input[@id={string}])")
public void i_enter_siddiquetestingselenium_gmail_com_into_input_field_having_xpath_input_id(String string) {
	//Send email address
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("siddiquetestingselenium@gmail.com");
    
}

@And("click on element having xpath \\(div[@id={string}])")
public void click_on_element_having_xpath_div_id(String string) {
	  driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
   
}

@Then("I enter Incubytes@{int} into input field having xpath input[@name={string}]")
public void i_enter_incubytes_into_input_field_having_xpath_input_name(Integer int1, String string) throws InterruptedException {
	WebElement passwordButton = driver.findElement(By.xpath("//input[@name='Passwd']"));
//	Thread.sleep(2000); 
	passwordButton.sendKeys("Incubytes@850");
  
}

@And("I click on element having xpath div[@id={string}]")
public void i_click_on_element_having_xpath_div_id(String string) {
	driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
    
}

@And("I click on element having xpath div[text\\()={string}]")
public void i_click_on_element_having_xpath_div_text(String string) {
	//Click on compose button
			driver.findElement(By.xpath("//div[text()='Compose']")).click();
 
}

@Then("I enter siddiquetestingselenium@gmail.com into input field having xpath \\(input[@class={string}]*)")
public void i_enter_siddiquetestingselenium_gmail_com_into_input_field_having_xpath_input_class(String string) {

	 //Enter the sender mail id
			try {
			driver.findElement(By.xpath("//input[@class='agP aFw']")).sendKeys("siddiquetestingselenium@gmail.com");
			}
			catch (org.openqa.selenium.StaleElementReferenceException ex){
				driver.findElement(By.xpath("//input[@class='agP aFw']")).sendKeys("siddiquetestingselenium@gmail.com");
			}
	 
}

@Then("I enter Incubyte into input field having xpath input[@name={string}]")
public void i_enter_incubyte_into_input_field_having_xpath_input_name(String string) {
	//Enter subject to the mail
	driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Incubyte");
  
}

@Then("I enter Automation QA test for Incubyte into input field having xpath div[@class={string}]")
public void i_enter_automation_qa_test_for_incubyte_into_input_field_having_xpath_div_class(String string) {
	//Enter the body of the mail
	driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Automation QA test for Incubyte");
   
}

	
    
	 

@And("I click on element having xpath div[text1\\()={string}]")
public void i_click_on_element_having_xpath_div_text1(String string) {
	 driver.findElement(By.xpath("//div[text()='Send']")).click();
 
}
	 
}



