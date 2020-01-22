package stepDefs;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import pages.BootCampsPage;
import pages.BostonIvyTechHomePage;
import utils.SingletonBrowser;
import utils.Utils;

public class BootCamps_StepDefs {

	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BostonIvyTechHomePage hp = new BostonIvyTechHomePage();
	BootCampsPage bcp = new BootCampsPage(driver);
	Utils util = new Utils();
	
	
	@Then("Verify BootVamps Register Now button")
	public void verify_BootVamps_Register_Now_button() throws InterruptedException {
		String parentWinHandle = driver.getWindowHandle();
		bcp.regButton.click();
		Set<String> winHandles = driver.getWindowHandles();
		for (String handle : winHandles) {
			if (!handle.equals(parentWinHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(1000);}}
		String actualTitle = driver.getTitle();
		assertTrue(actualTitle.contains("Class Registration"));
		driver.switchTo().window(parentWinHandle);
	}

	@Then("Verify Register here link")
	public void verify_Register_here_link() throws InterruptedException {
		String parentWinHandle = driver.getWindowHandle();
		bcp.regButton2.click();
		Set<String> winHandles = driver.getWindowHandles();
		for (String handle : winHandles) {
			if (!handle.equals(parentWinHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(1000);}}
		String actualTitle = driver.getTitle();
		assertTrue(actualTitle.contains("Class Registration"));
		driver.switchTo().window(parentWinHandle);
	
	}

	@Then("Verify from We Teach the link {string}")
	public void verify_from_We_Teach_the_link(String string) {
    bcp.listLinks(driver, string);
    String parentWinHandle = driver.getWindowHandle();
    Set<String> winHandles = driver.getWindowHandles();
	for (String handle : winHandles) {
		if (!handle.equals(parentWinHandle)) {
			driver.switchTo().window(handle);
			;}}
	String actualTitle = driver.getTitle();
	assertTrue(actualTitle.contains(string));
   System.out.println( driver.getTitle());
 
    
		
	}
}
