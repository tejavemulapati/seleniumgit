package testNgConcepts;

import org.testng.annotations.Test;

public class Priority {
	
  @Test(priority=0)
  public void apple() {
	  System.out.println("Inside apple method");
  }
  
  @Test(priority=1)
  public void aum() {
	  System.out.println("Inside aum method");
  }
  
  @Test
  public void alpha() {
	  System.out.println("Inside alpha method");
  }
}
