package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_Demo {
 
	@Test
  public void testTitle() 
  {
	  
	  String Exp_Title = "Oracle HRM";
	  String Act_Title = "Oracle HRM";

	  if(Exp_Title.equals(Act_Title))
	  {
		  System.out.println("Test pass");
	  Assert.assertTrue(true);
	  }
	  else
	  {System.out.println("Test fail");
	  Assert.assertTrue(false);
	  }
 
	
	  
	  Assert.assertEquals(Exp_Title, Act_Title); 
	  
	  
	  
	  
  }
}
