package testNgConcepts;

import org.testng.annotations.Test;

public class TestngException {
  
@Test(expectedExceptions = ArithmeticException.class)
  public void f() {
	  int i = 9/0;
	  System.out.println(i);
  }
}
