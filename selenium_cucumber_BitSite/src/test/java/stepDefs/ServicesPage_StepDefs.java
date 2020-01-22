package stepDefs;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import pages.BostonIvyTechHomePage;
import pages.HomePageTest;
import pages.ServicesPageTest;
import utils.SingletonBrowser;
import utils.Utils;

public class ServicesPage_StepDefs {

	
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BostonIvyTechHomePage hp = new BostonIvyTechHomePage();
	ServicesPageTest spt = new ServicesPageTest(driver);
	Utils util = new Utils();
	
	
	
	@Then("Verify Our Services header")
	public void verify_Our_Services_header() {
	 String actualText = spt.OurServicesText.getText();
	 assertTrue(actualText.contains("OUR SERVICES"));
	 
	}

	@Then("Verify QA header {string}")
	public void verify_QA_header(String expectedHeader) {
	String actualText = spt.headerListServices(driver);
		assertTrue(actualText.contains(expectedHeader));
	}

	@Then("Verify QA Engineer Boot Camps list element {string}")
	public void verify_QA_Engineer_Boot_Camps_list_element(String expectedElement) {
		String actualElement = spt.listServices(driver);
		assertTrue(actualElement.contains(expectedElement));
	}
	
	@Then("Verify Register Now button")
	public void verify_Register_Now_button() throws InterruptedException {
		String parentWinHandle = driver.getWindowHandle();
		spt.RegistrationButton.click();
		Set<String> winHandles = driver.getWindowHandles();
		for (String handle : winHandles) {
			if (!handle.equals(parentWinHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(1000);}}
		String actualTitle = driver.getTitle();
		assertTrue(actualTitle.contains("Class Registration"));
		driver.switchTo().window(parentWinHandle);
	}

	@Then("Verify Software Testing list element {string}")
	public void verify_Software_Testing_list_element(String expectedElement) {
		String actualElement = spt.listServices(driver);
		System.out.println(actualElement);
		assertTrue(actualElement.contains(expectedElement));  
	}

	@Then("Onsite Trainings list element {string}")
	public void onsite_Trainings_list_element(String string) {
		String actualElement = spt.listServices(driver);
		assertTrue(actualElement.contains(string));  
		
		System.out.println(actualElement);
	}
}
