package stepDefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

	@Then("Verify Registration button")
	public void verify_Registration_button() throws InterruptedException {
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
		String expectedTitle = "Class Registration – Boston Ivy Tech";
		assertEquals(expectedTitle, actualTitle);
	
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
