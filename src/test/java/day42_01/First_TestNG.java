package day42_01;

import org.testng.annotations.Test;

/*
 * Open application
 * Login
 * Logout 
 */

public class First_TestNG {

	
	@Test(priority=1)
	void openApplication()
	{System.out.println("OpenApplication");}
	
	
	
	
	@Test(priority=-1)
	void logout()
	{System.out.println("logout");}
	
	
	@Test(priority=-2)
	void login()
	{System.out.println("login");}
	
	
	
	
	
	
	
	
	
}
