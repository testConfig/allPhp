/**
 * 
 */
/**
 * @author Ahammed Sorif
 *
 */
package Test.singUp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseTest.TestBase;
import singUp.singUp;

class TC001_singUp extends TestBase{
		
	
	@BeforeMethod
	void setUp() {
		
		getIt(super.chrome, super.URL);
	}
	@Test
	void singupFrom() {
		singUp su =new singUp(Driver);
		su.SingUp();
	}
	
/*	@AfterMethod
	void close() {
		closeIt();
	}
	*/
	
	
}