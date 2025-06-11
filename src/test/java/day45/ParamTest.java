package day45;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParamTest {
 
	WebDriver cd;
	
	@BeforeClass
	@Parameters({"browser"})
  public void setup(String br) {
	System.out.println("set up ......."); 
	WebDriverManager.chromedriver().setup();
	WebDriverManager.firefoxdriver().setup();
	WebDriverManager.edgedriver().setup();
	WebDriverManager.iedriver().setup();
	switch(br)
	{
	case  "chrome" : cd = new ChromeDriver(); break;
	case  "edge" : cd = new EdgeDriver(); break;
	case  "firefox" : cd = new FirefoxDriver(); break;
	case "IE" : cd= new InternetExplorerDriver() ; break;
	default : System.out.println("invalid browser"); return;
	
	
	}
	
	
	
	cd.manage().window().maximize();
	cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
  }
	@Parameters({"url"})
 @Test(priority=1)
 public void testLogo(String url) {
	
	// cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	cd.get(url);
	 Boolean Status = cd.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	 if(Status==true)
	 {Assert.assertTrue(true);
	 }
	 else
	 {assertFalse(false);}
	 System.out.println("LOGO ......."); 
	  
	 
	 
 }
 
 
 @Test(priority=2)
 public void testTitle() {
	 System.out.println("TITLE ......."); 
	 Assert.assertEquals(cd.getTitle(), "OrangeHRM");
 }
 
 
 
 @Test(priority=3)
 public void testURL() {
	 System.out.println("URL ......."); 
	Assert.assertEquals(cd.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 }
 
 
 @AfterClass
 public void tearDown() {
	 System.out.println("tearDown ......."); 
	// cd.quit();
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
