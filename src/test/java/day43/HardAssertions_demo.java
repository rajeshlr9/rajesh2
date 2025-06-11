package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions_demo {
  @Test
  public void test() 
  
  {
	Assert.assertEquals(123, 123);  
    Assert.assertNotEquals("123", 123);
    Assert.assertTrue(1==1);
    Assert.assertFalse(1==2);
    
    Assert.fail();
    
    
  }
}
