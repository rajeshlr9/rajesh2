package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class BeforeAfter

{
	@BeforeClass
	void login()
 {System.out.println("This is login class");}
	
	@Test
	void searchclass()
 {System.out.println("This is search class");}
	
	@Test
	void AdvancedSearchclass()
 {System.out.println("This is AdvancedSearch class");}
	
	@AfterClass
	void logout()
	 {System.out.println("This is logout class");}
		
	
	
	
	
}




public class Annotations_Demo {
 
	
	
	@BeforeMethod
	void login()
 {System.out.println("This is login metohd");}
	
	@Test
	void searchmethod()
 {System.out.println("This is search metohd");}
	
	@Test
	void AdvancedSearchmethod()
 {System.out.println("This is AdvancedSearch metohd");}
	
	@AfterMethod
	void logout()
	 {System.out.println("This is logout metohd");}
	

	
}





