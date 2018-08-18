/**
 * 
 */
/**
 * @author Ahammed Sorif
 *
 */
package baseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import main.singIn.singInSetUp;

public class TestBase{
	public static	WebDriver Driver;
		public final String Firefox ="Firefox";
		public final String chrome ="chrome";
		public final String opera ="opera";
		public final String IE ="IE";
		public final String URL ="https://www.phptravels.net/";
			public final String Home="Home";
			public final String	Hotels="Hotels";
			public final String Flights="Flights";
			public final String Tours ="Tours";
			public final String Cars="Cars";
			public final String Visa="Visa";
			public final String Blog="Blog";                
			public final String My_Account="My Account";
		public final String Login = "Login";
		public final String SingUp = "Sign Up";
			public final String AdminUser = "admin@phptravels.com";
			public final String AdminPass = "demoadmin";
					
			

		
	/**
	 * it will launch the Browser
	 * @param Browser
	 */
	private void openBrowser(String Browser) {
				switch(Browser)
					{
						case "Firefox":
							System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//driverFile//geckodriver.exe");
							Driver = new FirefoxDriver();
							break;
						case"chrome":
							System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driverFile//chromedriver.exe");
							Driver = new ChromeDriver();
							break;
						case"opera":
							System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"//driverFile//operadriver.exe");
							Driver = new OperaDriver();
							break;
						case"IE":
							System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//driverFile//IEDriverServer.exe");
							Driver = new InternetExplorerDriver();
							break;
						default:
							System.out.println("Launching Browser have problem");
							break;
					}	
				}
	/**
	 * it will maximize the screen and preset the implicit wait time to 40s 
	 * and finaly it will launch the URL
	 * @param URL
	 */
	
	private void getURL(String URL) {
				Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				Driver.manage().window().maximize();
				Driver.get(URL);
		}
	
	/**
	 * it will be visible to user and it will perform prev method
	 * @param Browser
	 * @param URL
	 * @see getURL ,openBrowser
	 */
	public void getIt(String Browser, String URL) {
		openBrowser(Browser);
		getURL(URL);
		}
	public void mainNav(String NavBarName) {
		String xpath ="//div[@id='collapse']/ul[contains(@class,'navbar-nav')]//li/a[contains(text(),'"+NavBarName+"')]";
		Driver.findElement(By.xpath(xpath)).click();
		}
	public void closeIt() {
		Driver.close();
	}
	public void loginOrSingUp(String actionNam) {
		mainNav(this.My_Account);
		String actionPath ="//nav[contains(@class,'navbar-default')]//li[@id='li_myaccount']//li//a[contains(text(),'"+actionNam+"')]";
		Driver.findElement(By.xpath(actionPath)).click();
	}
	
	public void login(String UserNam, String PassWord) {
		singInSetUp SIS = new singInSetUp(Driver);
			loginOrSingUp(this.Login);
			SIS.singIncondition(UserNam, PassWord);
	}
	
	
	
	
	
}