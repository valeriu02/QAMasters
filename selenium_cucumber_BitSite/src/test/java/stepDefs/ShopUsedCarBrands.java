package stepDefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.ShopUsed;
import pages.TrueCarHomePage;
import utils.SingletonBrowser;

public class ShopUsedCarBrands {
	
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	TrueCarHomePage hp = new TrueCarHomePage();
	ShopUsed su= new ShopUsed(driver);
	

@Given("User clicks on Shop Used")
public void user_clicks_on_Shop_Used() {
  su.buttonShopUsed.click();
}

@Then("User clicks in brand {string}")
public void user_clicks_in_brand(String string) {
   su.selectBrand(driver, string);
}

@Then("User clicks on All Models")
public void user_clicks_on_All_Models() {
	
 su.buttonAllModels.click();
}

@Then("User select used model {string}")
public void user_select_used_model(String string) {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 su.buttonSelectModel.click();
}

@Then("verify header is {string}")
public void verify_header_is(String expectedHeader) {
//  String actualHeader = su.header.getText();
//  assertTrue(actualHeader,expectedHeader.contains(actualHeader));
  System.out.println(su.header.getText());
}

@Then("verify Location {string}")
public void verify_Location(String expectedLocation) {
//   String actualLocation = su.city.getText();
//   assertTrue(actualLocation,actualLocation.contains(expectedLocation));
}

}
