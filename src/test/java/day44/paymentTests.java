package day44;

import org.testng.annotations.Test;

public class paymentTests {
 
	@Test(priority=1,groups={"sanity","Regression","functional","login sanity"})
	  public void PaymentInRupees() 
	  
	  {System.out.println("This is Payment In Rupees....");
	  }


	  @Test(priority=2,groups={"sanity","Regression","functional"})
	  public void PaymentInDollers() 
	  
	  {System.out.println("This is Payment In Dollers....");
	  }


	  @Test(priority=3,groups={"sanity","Regression","functional"})
	  public void PaymentInPounds() 
	  
	  {System.out.println("This is Payment In Pounds....");
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
