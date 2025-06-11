package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

// 1) Constructor
// 2) Locators
// 3) Action methods


public class LoginPage {
 
	
// Constructor	
	WebDriver driver;
	LoginPage(WebDriver driver)
	{
		
	this.driver	= driver;
	
	
	}
	
// 2) Locators	
	
By username_Loc = By.name("username");
By password_Loc = By.name("password");
By loginbtn_Loc = By.xpath("//button[@type='submit']");

/*
By.xpath("//input[@placeholder='Username']")
By.xpath("//input[@placeholder='Password']")
By.xpath("//button[normalize-space()='Login']")
By.xpath("//img[@alt='company-branding']")
*/
	
//3) Action methods

// every locator should have a action method.

public void setUserName(String username)
{
	driver.findElement(username_Loc).sendKeys(username);
	
}

public void setPassWord(String password)
{
	driver.findElement(password_Loc).sendKeys(password);
	
}

public void clickLogin()
{
	driver.findElement(loginbtn_Loc).click();
}


}
