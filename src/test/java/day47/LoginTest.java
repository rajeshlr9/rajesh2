package day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
 
	WebDriver cd;
	
	@BeforeClass
	void setup()
	{
WebDriverManager.chromedriver().setup();
cd = new ChromeDriver(); 
cd.manage().window().maximize();
cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//Thread.sleep(5000);  
	  
	  
	}
@Test
	void testLogin()
	{
		/*
		LoginPage lp = new LoginPage(cd);
		lp.setUserName("Admin");
		lp.setPassWord("admin123");
		lp.clickLogin();
		*/
		
		
	LoginPageFactory lpF = new LoginPageFactory(cd);
	
	lpF.SetUsername("Admin");
	lpF.SetPassword("admin123");
	lpF.loginclick();
	
		Assert.assertEquals(cd.getTitle(), "OrangeHRM");
		
	}
	
@AfterClass
	void tearDown()
	{
		cd.close();
		
	}
	
	
}
