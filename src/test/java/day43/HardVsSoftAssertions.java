package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
  @Test
  public void testHardAssertions() 
   
  {
	  
	    Assert.assertEquals(123, 123);  
	    Assert.assertNotEquals("123", 123);
	    Assert.assertTrue(1==2);
	    Assert.assertFalse(1==2);
	    
	    //Assert.fail();  
	  
	  System.out.println("hi");
	  
  }
  
  @Test
  public void testSoftAssertions() 
  
  {
	  
	 
	    
	    //Assert.fail();  
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(123, 456);
	  sa.assertNotEquals("123", 123);
	  sa.assertTrue(1==3);
	  sa.assertFalse(1==2);
	  System.out.println("hello");
	  
	  sa.assertAll();
	  
  }
  
  
  
  
  
  
  
  
  
  
}
