package pages;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class HomePageTest {

	
	public HomePageTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (css ="[class='ast-site-identity']")
	public WebElement logo;
	
	
	@FindBy(css = "[class='main-navigation'] li")
	public List<WebElement> menubar;
	
	@FindBy(css = "[class='main-navigation'] li a")
	public List<WebElement> menubarName;
	
	@FindBy(css = "[data-id='e5e7443'] [class ='elementor-heading-title elementor-size-default']")
	public WebElement ourServices;
	
	@FindBy(css = "[data-id='874b8fb'] [class = 'elementor-button-content-wrapper']")
	public WebElement qaTestingLM;
	
	@FindBy(css = "[data-id='7ef62b9'] [class = 'elementor-button-text']")
	public WebElement softwareTestingLM;
	
	@FindBy(css = "[data-id='88120ac'] [class = 'elementor-button-content-wrapper']\r\n" + 
			"")
	public WebElement onsiteTrainingsLM;
	
		
	@FindBy(css ="[data-id='6d0d9cb'] [class ='elementor-button-wrapper'] a")
	public WebElement FirstRegButton;
	
	@FindBy(css ="[data-id='4dc4ffc'] [class = 'elementor-button-text']\r\n" + 
			"")
	public WebElement SecondRegButton;
	
	
	@FindBy(css ="[id = 'menu-item-13']")
	public WebElement homeButton;
	
	@FindBy(css ="[id ='menu-item-12']")
	public WebElement aboutButton;
	
	@FindBy(css ="[id ='menu-item-289']")
	public WebElement servicesButton;
	
	@FindBy(css ="[id = 'menu-item-288']")
	public WebElement bootCampButton;
	
	@FindBy(css ="[id = 'menu-item-150']")
	public WebElement contactButton;

	
	
	
}
