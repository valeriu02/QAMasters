package stepDefs;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import pages.BostonIvyTechHomePage;
import pages.RegistrationPage;
import pages.ServicesPageTest;
import utils.SingletonBrowser;
import utils.Utils;

public class Registration_StepDefs {

	
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BostonIvyTechHomePage hp = new BostonIvyTechHomePage();
	RegistrationPage rp = new RegistrationPage(driver);
	Utils util = new Utils();



@Then("Check the title of the page")
public void check_the_title_of_the_page() {
 String actualTitle  = driver.getTitle();
 assertTrue(actualTitle.contains("Class Registration"));
  

}
	@Then("User enter First Name {string}")
	public void user_enter_First_Name(String string) {
	 rp.firstname.sendKeys(string);
	}

	@Then("User enter Middle Name {string}")
	public void user_enter_Middle_Name(String string) {
		rp.middlename.sendKeys(string);
	}

	@Then("User enter Last Name {string}")
	public void user_enter_Last_Name(String string) {
		rp.lastname.sendKeys(string);
	}

	@Then("User select gender {string}")
	public void user_select_gender(String string) {
	   rp.gender(driver, string);
	}

	@Then("User eneter Email {string}")
	public void user_eneter_Email(String string) {
		rp.email.sendKeys(string);
	}

	@Then("User enter Phone Number {string}")
	public void user_enter_Phone_Number(String string) {
		rp.phone.sendKeys(string);
	}

	@Then("User select if he is Authorized to work in US {string}")
	public void user_select_if_he_is_Authorized_to_work_in_US(String string) {
	if (string.contentEquals("Yes")) {
		rp.AUS.get(0).click();
	}
	else rp.AUS.get(1).click();
	}

	@Then("User select if he have Past Programming Experience {string}")
	public void user_select_if_he_have_Past_Programming_Experience(String result) throws InterruptedException {
		Thread.sleep(2000);
		if(result.contentEquals("Yes")) {
			rp.PPE.get(0).click();
		}
		else rp.PPE.get(1).click();
	}
	

	@Then("User click on Subbmit Button")
	public void user_click_on_Subbmit_Button() {
	   rp.SubmitButton.click();
	}

	@Then("Verify submiting by message")
	public void verify_submiting_by_message() throws InterruptedException {
		Thread.sleep(2000);
	String actualText =   rp.message.getText();  
	assertTrue(actualText.contains("Form has been submitted successfully."));
	
	}



}
