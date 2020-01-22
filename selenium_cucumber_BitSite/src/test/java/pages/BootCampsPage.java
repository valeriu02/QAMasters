package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class BootCampsPage {

	
	
	public BootCampsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
//	[class='elementor-image-box-img'] [class *='elementor-a'] 
	
	
	@FindBy(css = "[data-id = '9b329fa'] [class *= 'elementor-button-l'] ")
	public WebElement regButton;
	
	@FindBy (css = "[href='https://bostonivytech.com/class-registration']")
	public WebElement regButton2;
	
	
	public List<WebElement> listLinks (WebDriver driver, String string){
		List<WebElement> list = driver.findElements(By.cssSelector("[class='elementor-image-box-img'] [class *='elementor-a']"));
	
		if(string.contentEquals("Java")) {
			list.get(0).click();
		}
		if(string.contentEquals("Selenium")) {
			list.get(1).click();
		}
		if(string.contentEquals("Junit")) {
			list.get(2).click();
		}
		if(string.contentEquals("Maven")) {
			list.get(3).click();
		}
		if(string.contentEquals("Postman")) {
			list.get(4).click();
		}
		if(string.contentEquals("Rest-assured")) {
			list.get(5).click();
		}
		if(string.contentEquals("Cucumber")) {
			list.get(6).click();
		}
		if(string.contentEquals("Karate")) {
			list.get(7).click();
		}
		if(string.contentEquals("Apache POI")) {
			list.get(8).click();
		}
		if(string.contentEquals("Software Development Life Cyclenit")) {
			list.get(9).click();
		}
		if(string.contentEquals("SoapUI")) {
			list.get(10).click();
		}
		if(string.contentEquals("Git")) {
			list.get(11).click();
		}
	
		return list;
		
		
	}
	}
	

