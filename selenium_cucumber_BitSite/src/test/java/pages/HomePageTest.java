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
	
	
}
