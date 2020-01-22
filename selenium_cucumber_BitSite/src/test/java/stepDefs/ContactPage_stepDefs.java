package stepDefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.AboutPage;
import pages.BostonIvyTechHomePage;
import pages.ContactPage;
import utils.SingletonBrowser;
import utils.Utils;

public class ContactPage_stepDefs {
	SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
	WebDriver driver = sb.getDriver();
	BostonIvyTechHomePage hp = new BostonIvyTechHomePage();
	ContactPage contact = new ContactPage(driver);
	Utils util = new Utils();

	@Given("First user enters required {string}")
	public void first_user_enters_required(String YourName) {
		contact.youNameField.sendKeys(YourName);
	}

	@When("Second user enters required {string}")
	public void second_user_enters_required(String YouEmail) {
		contact.youEmailField.sendKeys(YouEmail);
	}

	@Then("Third user enters {string}")
	public void third_user_enters(String Subject) {
		contact.subjectField.sendKeys(Subject);
	}

	@When("Forth user enters {string}")
	public void forth_user_enters(String Message) {
		contact.yourMessageFiled.sendKeys(Message);
	}

	@When("user send contact")
	public void user_send_contact() {
		contact.sendButton.click();
	}

	@Then("Verifies {string}")
	public void verifies(String ExpectedMassage) {
		String ActualMessage = contact.acceptanceMessage.getText().toString();
		assertTrue(ActualMessage.contains(ExpectedMassage));
		System.out.println(ExpectedMassage);
		System.out.println(ActualMessage);
	
	}
	
	@Then("Chck Contact Info")
	public void chck_Contact_Info() {
		List<String> list1 = new ArrayList<String>();
		contact.contacInfo.forEach(s -> list1.add(s.getText()));
		List<String> list2 = new ArrayList<String>(Arrays.asList("827 Main Street,Woburn, MA 01801","info@bostonivytech.com","(857) 209-4939"));
		System.out.println(list1.size());
		System.out.println(list2.size());
		//assertEquals(list2, list1);
		for (int i = 0; i < list1.size(); i++) {
			assertEquals(list2.get(i), list1.get(i).trim(),list1.get(i));
		}
	}

}
