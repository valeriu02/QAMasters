package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPageTest {

	
	public ServicesPageTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (css ="[class='elementor-icon-box-content'] h1 span")
	public WebElement OurServicesText;
	
	 
	@FindBy(css = "[class='elementor-widget-container'] h2")
	public List<WebElement> headerlist;
	
	public  String headerListServices(WebDriver driver) {
		List<WebElement> list = driver.findElements(By.cssSelector("[class='elementor-widget-container'] h2"));
		List<String> list1 = new ArrayList<String>();
		list.forEach(s -> list1.add(s.getText()));
		 String actualText = String.join(",", list1);
		return actualText;
	}
	
	
	public  String listServices(WebDriver driver) {
		List<WebElement> list = driver.findElements(By.cssSelector("[class='elementor-text-editor elementor-clearfix']"));
		List<String> list1 = new ArrayList<String>();
		list.forEach(s -> list1.add(s.getText()));
		 String actualText = String.join(",", list1);
		return actualText;
	
	
	}
	
	@FindBy(css ="[class='elementor-button-wrapper'] a")
	public WebElement RegistrationButton;
	
}
