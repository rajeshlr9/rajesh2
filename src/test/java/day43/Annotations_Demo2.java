package day43;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo2 {
  @Test
  public void f() 
  { System.out.println("Test Case 2");
  }
  
  @BeforeTest
  public void test()
  {System.out.println("This is before test");}
  
  
  @AfterTest
  public void test1()
  {System.out.println("This is After test");}
  
}
