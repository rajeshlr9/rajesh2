package day42_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Second_TestNG {
 
WebDriver cd;
	 
	
	
	@Test(priority=1)
 void openapp() 
 {
 
		WebDriverManager.chromedriver().setup();
		cd = new ChromeDriver();	
		
		
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		cd.manage().window().maximize();
 
 }
  
  @Test(priority=2)
  void testlogo() throws InterruptedException 
  {
	  
	  System.out.println(cd.getTitle());
	  Thread.sleep(5000);
	  boolean logo = cd.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println(logo); 
	  if (logo==true)
	   {System.out.println("Logo is present");}
	   

	  
	  
	  
	  
  }
  
 
@Test(priority=3)
  void login() throws InterruptedException
  {
	
	cd.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	
	cd.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	
	cd.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	
  }
  
  @Test(priority=4)
  void logout() throws InterruptedException
  
  {
	
	  cd.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	  cd.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
	  Thread.sleep(5000);
	  boolean logo = cd.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println(logo); 
	  if (logo==true)
	   {System.out.println("Logout is completed");}
	  Thread.sleep(5000);
	  cd.close();
	  
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
