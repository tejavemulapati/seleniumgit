package testNgConcepts;

import org.testng.annotations.Test;

public class ExceptionalTimeoutTest {
	
	//If particular tc is struck is in infinite loop we
	//use timeout method
	
//	@Test(invocationTimeOut = 300) //3seconds
//	public void infintLoopTest() {
//		int i =1;
//		while(i==1) {
//			System.out.println(i);
//		}
		
	//without using try/catch
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		
		String x = "10A";
		Integer.parseInt(x);
		
		}
	}

