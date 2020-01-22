package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

		public ContactPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
@FindBy (css = "[id *= 'w'] [class *= 'wpcf7-form-control wpcf7-text wpcf7-v']")
public WebElement youNameField;

@FindBy (css = "[id *= 'w'] [class *= 'wpcf7-form-control wpcf7-text wpcf7-e']")
public WebElement youEmailField;

@FindBy (css = "[name = 'your-subject']")
public WebElement subjectField;

@FindBy (css = "[id *= 'w'] [class *= 'wpcf7-form-control wpcf7-texta']")
public WebElement yourMessageFiled;

@FindBy (css = "[class = \"wpcf7-form-control wpcf7-submit\"]")
public WebElement sendButton;

@FindBy (css = "[class *= 'wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ok']")
public WebElement acceptanceMessage;

@FindBy (css = "[class = 'elementor-icon-box-description']")
public List<WebElement> contacInfo; 

		
		
}
