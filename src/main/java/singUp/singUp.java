package singUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseTest.TestBase;

/**
 * 
 */
/**
 * @author Ahammed Sorif
 *
 */
public class singUp extends TestBase{
	
	WebDriver Driver;
	public singUp(WebDriver driver){
		this.Driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="input[name='firstname']")
	WebElement firstName;
	@FindBy(css="input[name='lastname']")
	WebElement lastName;
	@FindBy(css="input[name='phone']")
	WebElement phone;
	@FindBy(css="input[name='email']")
	WebElement email;
	@FindBy(css="input[name='password']")
	WebElement password;
	@FindBy(css="input[name='confirmpassword']")
	WebElement confirmpassword;
	@FindBy(css=".signupbtn.btn_full.btn.btn-action.btn-block.btn-lg")
	WebElement submitteButton;


	private void singUpform(String FirstNum,String LastNum,String PhoneNum,String emailadd,String pass) {
		
		//Driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Ahammed");
		firstName.sendKeys(FirstNum);
		lastName.sendKeys(LastNum);
		phone.sendKeys(PhoneNum);
		email.sendKeys(emailadd);
		password.sendKeys(pass);
		confirmpassword.sendKeys(pass);
		submitteButton.click();
	}
	/*void testUp() {
		Driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Hello");
	}*/
	public void SingUp() {
		loginOrSingUp(super.SingUp);
		singUpform("Ahammed","Sorif","3478499077","sor@gmail.com","12345Rana");
		//testUp();
	}
	
	
	
}