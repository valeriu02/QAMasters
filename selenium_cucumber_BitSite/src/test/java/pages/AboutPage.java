package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
	public AboutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy (css = "[class = 'elementor-icon-box-title']")
	public WebElement aboutPageHeader;
	
	@FindBy (css = "[data-id *= '43a'] [class *= 'elementor-h'")
	public WebElement aboutUsBoldOutline;
	
	@FindBy (css = "[data-id *='903c186'] [class *= 'elementor-h'")
	public WebElement ourBagroundOutline;
	
	
	
	
}
