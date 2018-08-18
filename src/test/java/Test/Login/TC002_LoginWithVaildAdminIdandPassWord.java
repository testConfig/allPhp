package Test.Login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseTest.TestBase;
import main.singIn.singInSetUp;
import singUp.singUp;

public class TC002_LoginWithVaildAdminIdandPassWord extends TestBase{
	@BeforeMethod
	void setUp() {
		
		getIt(super.chrome, super.URL);
	}
	@Test
	void singupFrom() {
		singInSetUp su = new singInSetUp(Driver);
		login(su.username,su.userpass);
	}
	
	@AfterMethod
	void close() {
		closeIt();
	}
}
