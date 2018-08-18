/**
 * 
 */
/**
 * @author Ahammed Sorif
 *
 */
package flightReservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import baseTest.TestBase;

class FlightReservation extends TestBase{
	WebDriver Driver;
	
	@FindBy(how= How.CSS, using="#s2id_location_to .select2-choice.select2-default")
	WebElement arraivalDes;
	@FindBy(css="#s2id_location_from .select2-choice.select2-default")
	WebElement depertureDes;
	@FindBy(css=".form-control.input-lg.departureTime")
	WebElement depTime;
	@FindBy(css=".form-control.input-lg.arrivalTime")
	WebElement arrTime;
	@FindBy(css=".form-control.input-lg[name='totalManualPassenger']")
	WebElement numPass;
	@FindBy(css=".travellercount.form-control[name='madult']")
	WebElement numAdult;
	@FindBy(css="#sumManualPassenger")
	WebElement doneButton;
	@FindBy(css=".btn-danger.btn.btn-lg.btn-block.pfb0")
	WebElement searchButton;
	
}