/**
 * 
 */
/**
 * @author Ahammed Sorif
 *
 */
package main.singIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class singInSetUp{
	public final String username ="user@phptravels.com";
	public final String userpass="Rana0260";
	 WebDriver Driver;
	 @FindBy(css="input[name='username']")
	 WebElement userName;
	 @FindBy(css="input[name='password']")
	 WebElement passWord;
	 @FindBy(css=".btn.btn-action.btn-lg.btn-block.loginbtn")
	 WebElement loginButton;
	 public singInSetUp(WebDriver driver) {
		 this.Driver=driver;
		 PageFactory.initElements(driver, this);
		 
	 }
	 public void singIncondition(String UserNam ,String PassWord) {
		 
		 userName.sendKeys(UserNam);
		 passWord.sendKeys(PassWord);
		 loginButton.click();
	 }
/*	 public void verifylogin() {
		 WebDriverWait WD = new WebDriverWait(Driver, 60);
		 WebElement element = WD.until(ExpectedConditions.visibilityOf(Driver.findElement(By.cssSelector(""))))
		 
		 
	 }*/
	 
	 
 }