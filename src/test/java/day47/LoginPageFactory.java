package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageFactory {
 // constructor
	WebDriver driver;
	LoginPageFactory(WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	
	}

	
// locators
	
	/*
	By.xpath("//input[@placeholder='Username']")
	By.xpath("//input[@placeholder='Password']")
	By.xpath("//button[normalize-space()='Login']")
	By.xpath("//img[@alt='company-branding']")
	*/	
	
@FindBy(xpath = "//input[@placeholder='Username']")
WebElement username;
	
	
@FindBy(name="password")
WebElement password;
	
@FindBy(xpath="//button[normalize-space()='Login']")
WebElement loginbtn;
	
// Actions Methods

public void SetUsername(String user)
{username.sendKeys(user);
}

public void SetPassword(String pwd)
{
password.sendKeys(pwd);
}

public void loginclick()
{loginbtn.click();}


	
	
	
	
	
	
	
	
	
}
