package day44;

import org.testng.annotations.Test;

public class LoginTests {
  @Test(priority=1,groups={"login sanity","sanity"})
  public void loginByEmail() 
  
  {System.out.println("This is Login by email....");
  }


  @Test(priority=2,groups={"sanity"})
  public void loginByFacebook() 
  
  {System.out.println("This is Login by Facebook....");
  }


  @Test(priority=3,groups={"sanity"})
  public void loginByTwitter() 
  
  {System.out.println("This is Login by Twitter....");
  }












}
