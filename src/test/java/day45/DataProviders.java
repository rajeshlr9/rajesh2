package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {
 
	WebDriver cd;
	
	@BeforeClass
   void setup() {
	
		WebDriverManager.chromedriver().setup();
		cd = new ChromeDriver();
	cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
  cd.manage().window().maximize();
	}
  
  
  @Test(dataProvider="dp")
   void testLogin(String email , String pwd) throws InterruptedException {
	 cd.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	 cd.findElement(By.id("input-email")).sendKeys(email);
	 cd.findElement(By.id("input-password")).sendKeys(pwd);
	 cd.findElement(By.xpath("//input[@value='Login']")).click(); 
	  Thread.sleep(2000);
	  
	  
	  
   }
   
  
  
  
  @AfterClass
   void tearDown() {
  
  cd.close();
  }
   
  
  @DataProvider(name="dp",indices={0,4})
  Object[][] loginData()
  {
	  
	Object data[][]={
			{"QAZX@gmail.com","test@123"},{"ABC@gmail.com","test@123"},{"abc@gmail.com","test@123"},{"XYZ@gmail.com","test@123"},{"123@gmail.com","test@123"}
			};
	  
	return data;  
	  
	  
  }
  
  
  
  
  
  
  
  
}
