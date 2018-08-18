package demoTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseTest.TestBase;
import singUp.singUp;

public class demoTest extends TestBase {
	@BeforeMethod
	void setUp() {
		
		getIt(super.chrome, super.URL);
	}
	@Test
	void singupFrom() {
	}
	
	@AfterMethod
	void close() {
		closeIt();
	}
	

}
