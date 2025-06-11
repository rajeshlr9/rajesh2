package day43;

import org.testng.annotations.Test;

public class Annotation_Demo3 {
  @Test
  public void Suite() 
  
  {System.out.println("This is from Demo 3");
  }
  
  @org.testng.annotations.BeforeSuite
public void BeforeSuite() 
  
  {System.out.println("This is Before Suite");
  }
  
  @org.testng.annotations.AfterSuite
  public void AfterSuite() 
    
    {System.out.println("This is After Suite");
    }
  
  
}
