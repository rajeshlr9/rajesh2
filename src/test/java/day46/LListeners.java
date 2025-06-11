package day46;

import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

 // @Listeners(day46.MyListener.class)
public class LListeners {
 
WebDriver cd;
	
	@BeforeClass
	
  public void setup() throws InterruptedException {
	//System.out.println("set up ......."); 
	WebDriverManager.chromedriver().setup();
	WebDriverManager.firefoxdriver().setup();
	WebDriverManager.edgedriver().setup();
	WebDriverManager.iedriver().setup();
	
	 cd = new ChromeDriver(); 
	 cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

	}
	
	
	
	
	
	

	
 @Test(priority=1)
 public void testLogo()  {
	
	//cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//Thread.sleep(5000);
	 boolean Status = cd.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	 Assert.assertEquals(Status, true);
	Assert.assertTrue(true);
	// System.out.println("LOGO ......."); 
	  
	 
	 
 }
 
 

 
 
 @Test(priority=2)
 public void testURL() {
	// System.out.println("URL ......."); 
	Assert.assertEquals(cd.getCurrentUrl(), "https://source-demo.orangehrmlive.com/web/index.php/auth/login");
 }
 
 
 @Test(priority=3,dependsOnMethods={"testURL"})
 public void testTitle() {
	 //System.out.println("TITLE ......."); 
	 Assert.assertEquals(cd.getTitle(), "OrangeHRM");
 }
 
 
 @AfterClass
 public void tearDown() {
	// System.out.println("tearDown ......."); 
	cd.quit();
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}