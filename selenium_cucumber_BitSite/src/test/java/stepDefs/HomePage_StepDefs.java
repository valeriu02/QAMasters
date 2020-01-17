package stepDefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import junit.framework.*;
import pages.BostonIvyTechHomePage;
import pages.HomePageTest;
import utils.SingletonBrowser;


public class HomePage_StepDefs {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BostonIvyTechHomePage hp = new BostonIvyTechHomePage();
	HomePageTest hpt= new HomePageTest(driver);
	
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
	 hp.goToHomePage(driver);
	}

	@Given("check the title")
	public void check_the_title() {
		String ExpectedTitle = "Boston Ivy Tech – Your Signature in IT";
		String ActualTitle = driver.getTitle();
		assertEquals(ExpectedTitle, ActualTitle);
	}

	@Then("User click on Logo")
	public void user_click_on_Logo() {
	   hpt.logo.click();
	}

	@Then("Verify number of Menu is {int}")
	public void verify_number_of_Menu_is(Integer expectedTopMenu) {
		 Integer actualTopMenu =  hpt.menubar.size();
		 assertEquals(expectedTopMenu, actualTopMenu);	  
	}

	@Then("Verify items of Menu bar")
	public void verify_items_of_Menu_bar() {
//	   List<Object> 
	
		
		
	}

	@Then("Verify Registration button")
	public void verify_Registration_button() {
	    
	}

	@Then("Verify Our Service headers")
	public void verify_Our_Service_headers() {
	   
	}

	@Then("Verify Learn More button")
	public void verify_Learn_More_button() {
	    
	}

	@Then("Verify Our Boot Camps headers")
	public void verify_Our_Boot_Camps_headers() {
	   
	}

	@Then("Verify Second Registration button")
	public void verify_Second_Registration_button() {
	   
	}

}
