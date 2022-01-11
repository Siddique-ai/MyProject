

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrm {

	
	@Test
	public void postivcredentials() {
     	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Home h=new Home(driver);
		h.typeusername();
		h.typepasswor();
		h.Clickonllogin();
		

		Login l=new Login(driver);
		l.clickonmarket();
	 
		
		Welcome w=new  Welcome(driver);
		w.clickonrequest();
}
}