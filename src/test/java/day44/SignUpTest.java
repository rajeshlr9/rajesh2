package day44;

import org.testng.annotations.Test;

public class SignUpTest {
 
	@Test(priority=1,groups={"login sanity" , "Regression"})
	  public void SignupByEmail() 
	  
	  {System.out.println("This is Signup by email....");
	  }


	  @Test(priority=2,groups={"Regression"})
	  public void SignupByFacebook() 
	  
	  {System.out.println("This is Signup by Facebook....");
	  }


	  @Test(priority=3,groups={"Regression"})
	  public void SignupByTwitter() 
	  
	  {System.out.println("This is Signup by Twitter....");
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
