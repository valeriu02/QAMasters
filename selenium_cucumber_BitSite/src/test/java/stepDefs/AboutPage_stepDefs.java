package stepDefs;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.AboutPage;
import pages.BostonIvyTechHomePage;
import pages.HomePageTest;
import utils.SingletonBrowser;
import utils.Utils;

public class AboutPage_stepDefs {
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BostonIvyTechHomePage hp = new BostonIvyTechHomePage();
	AboutPage abt = new AboutPage(driver);
	Utils util = new Utils();
	
	@Then("Verify About Header")
	public void verify_About_Header() {
	    String ActualHeader = abt.aboutPageHeader.getText().toString();
	    String ExpectedHeader = "WA ARE";
	    System.out.println(ExpectedHeader);
	    System.out.println(ActualHeader);
	    assertTrue(ActualHeader.contains("WE"));
	    
	}

	@Then("Verify Bold Outlines of About Page")
	public void verify_Bold_Outlines_of_About_Page() {
	   String ActualOutline = abt.aboutUsBoldOutline.getText().toString();
	   String ExpectedOutline = "ABOUT US";
	   System.out.println(ActualOutline);
	   assertTrue(ActualOutline.contains("ABOUT"));
	   String ActualOutline2 = abt.ourBagroundOutline.getText().toString();
	   String ExpectedOutline2 = "OUR BACKGROUND";
	   System.out.println(ActualOutline2);
	  // assertTrue(ActualOutline2.contains("OUR"));

	}

	
	
	
	
	
}
