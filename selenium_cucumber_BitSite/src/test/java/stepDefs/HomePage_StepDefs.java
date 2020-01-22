
package stepDefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import junit.framework.*;
import pages.BostonIvyTechHomePage;
import pages.HomePageTest;
import utils.SingletonBrowser;
import utils.Utils;

public class HomePage_StepDefs {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BostonIvyTechHomePage hp = new BostonIvyTechHomePage();
	HomePageTest hpt = new HomePageTest(driver);
	Utils util = new Utils();

	@Given("User is on home page")
	public void user_is_on_home_page() {
		hp.goToHomePage(driver);
	}

	@Given("check the title")
	public void check_the_title() {
		//String ExpectedTitle = "Boston Ivy Tech � Your Signature in IT";
		String ActualTitle = driver.getTitle();
		assertTrue(ActualTitle.contains("Your Signature in IT"));
	}

	@Then("User click on Logo")
	public void user_click_on_Logo() {
		hpt.logo.click();
	}

	@Then("Verify number of Menu is {int}")
	public void verify_number_of_Menu_is(Integer expectedTopMenu) {
		Integer actualTopMenu = hpt.menubar.size();
		assertEquals(expectedTopMenu, actualTopMenu);
	}

	@Then("Verify items of Menu bar")
	public void verify_items_of_Menu_bar() {
		List<String> list1 = new ArrayList<String>();
		hpt.menubar.forEach(s -> list1.add(s.getText()));
		List<String> list2 = new ArrayList<String>(Arrays.asList("Home", "About", "Services", "Boot Camps", "Contact"));
		assertEquals(list2, list1);

	}

	@Then("Verify Our Service headers")
	public void verify_Our_Service_headers() {
		String actualResults = hpt.ourServices.getText().toString();
		assertTrue(actualResults.contains("OUR SERVICES"));

	}

	@Then("Verify QA Testing Boot Camps Learn More button")
	public void verify_QA_Testing_Boot_Camps_Learn_More_button() {
		hpt.qaTestingLM.click();
		String actualTitle = driver.getTitle();

		
		assertTrue(actualTitle.contains("Services"));
		

	}

	@Then("Verify Software Testing Learn More button")
	public void verify_Software_Testing_Learn_More_button() {
		hp.goToHomePage(driver);
		hpt.softwareTestingLM.click();
		String actualTitle = driver.getTitle();
		assertTrue(actualTitle.contains("Services"));

		
	}

	@Then("Verify Onsite Trainings Learn More button")
	public void verify_Onsite_Trainings_Learn_More_button() {
		hp.goToHomePage(driver);
		hpt.onsiteTrainingsLM.click();
		String actualTitle = driver.getTitle();

		assertTrue(actualTitle.contains("Services"));

	}

	@Then("Verify Our Boot Camps headers")
	public void verify_Our_Boot_Camps_headers() {
		hp.goToHomePage(driver);
		String actualTitle = hpt.ourBootCampBottomLogo.getText().toString();
		String expectedTitle = "OUR BOOT CAMPS";
		System.out.println(actualTitle);
		assertEquals(expectedTitle, actualTitle);
		
	}

	@Then("Verify Second Registration button")
	public void verify_Second_Registration_button() throws InterruptedException {
		hp.goToHomePage(driver);
		String parentWinHandle = driver.getWindowHandle();
		hpt.SecondRegButton.click();
		Set<String> winHandles = driver.getWindowHandles();
		for (String handle : winHandles) {
			if (!handle.equals(parentWinHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(1000);
				System.out.println("Title of the new window: " + driver.getTitle());
			}
		}

		String actualTitle = driver.getTitle();
		String expectedTitle = "Class Registration  Boston Ivy Tech";
		assertTrue(actualTitle.contains("Class Registration"));
	}

	@Then("Verify Registration button")
	public void verify_Registration_button() throws InterruptedException {
		hp.goToHomePage(driver);
		String parentWinHandle = driver.getWindowHandle();
		hpt.FirstRegButton.click();
		Set<String> winHandles = driver.getWindowHandles();
		for (String handle : winHandles) {
			if (!handle.equals(parentWinHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(1000);
				System.out.println("Title of the new window: " + driver.getTitle());
			}
		}

		String actualTitle = driver.getTitle();
		String expectedTitle = "Class Registration  Boston Ivy Tech";
		assertTrue(actualTitle.contains("Class Registration"));

	}
	
	@Then("Verify Home button")
	public void verify_Home_button() {
		hp.goToHomePage(driver);
		hpt.homeButton.click();
		String actualTitle = driver.getTitle();

		String expectedTitle = "Boston Ivy Tech  Your Signature in IT";
		assertTrue(actualTitle.contains("Boston Ivy Tech"));

		
	}

	@Then("Verify About button")
	public void verify_About_button() {
		hp.goToHomePage(driver);
		hpt.aboutButton.click();
		String actualTitle = driver.getTitle();

		String expectedTitle = "About  Boston Ivy Tech";
		assertTrue(actualTitle.contains("About"));

	}

	@Then("Verify Services button")
	public void verify_Services_button() {
		hp.goToHomePage(driver);
		hpt.servicesButton.click();
		String actualTitle = driver.getTitle();

		String expectedTitle = "Services  Boston Ivy Tech";
		assertTrue(actualTitle.contains("Services"));

	}

	@Then("Verify Boot Camp button")
	public void verify_Boot_Camp_button() {
		hp.goToHomePage(driver);
		hpt.bootCampButton.click();
		String actualTitle = driver.getTitle();

		String expectedTitle = "Boot Camps  Boston Ivy Tech";
		assertTrue(actualTitle.contains("Boot Camps"));

	}

	@Then("Verify Contanct button")
	public void verify_Contanct_button() {
		hp.goToHomePage(driver);
		hpt.contactButton.click();
		String actualTitle = driver.getTitle();

		String expectedTitle = "Contact  Boston Ivy Tech";
		assertTrue(actualTitle.contains("Contact"));

	}

}
