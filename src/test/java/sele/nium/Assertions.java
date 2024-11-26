package sele.nium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Assertions {
String Assertionn = "HardAssetion";

  @Test
  public void hardAssert() {
	  Assert.assertEquals("HardAssetion", Assertionn);
	  System.out.println("Pass");
	  Assert.assertTrue(Assertionn.equals("HardAssetion"));
	  System.out.println("fail");
  }
  @Test
  public void softassert1() {
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals("Hard_Assetionn", Assertionn);
		  System.out.println("fail");
		  softAssert.assertTrue(Assertionn.equals("HardAssetion"));
		  System.out.println("pas");
      //softAssert.assertAll();
  }
  public class AssertionsDemo 
  {
  	 SoftAssert softAssert=new SoftAssert();
  	String assertionString="demoforHardAssertion";
  	 @Test
  	  public void test1() 
  	  {
  		softAssert.assertEquals("demoforHardAssertions", assertionString);	 
  		//softAssert.assertAll();  
  	  }
  		
  	 @Test
  	  public void test2() 
  	  {
  		 softAssert.assertEquals("demoforHardAssertion", assertionString);	  
  		 softAssert.assertAll(); 
  		  
  	  }
    
  }
}
