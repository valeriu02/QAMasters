package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy (css = "[id='1']")
	public WebElement firstname;
	
	@FindBy (css = "[id='3']")
	public WebElement middlename;
	
	@FindBy (css = "[id='2']")
	public WebElement lastname;
	
	
	public String gender(WebDriver driver, String string) {
		Select dropdown = new Select(driver.findElement(By.cssSelector("[name='_aol_app_10']")));
		dropdown.selectByVisibleText(string);
		return string;
	}
	
	
	@FindBy (css = "[id='5']")
	public WebElement email;
	
	@FindBy (css = "[id='6']")
	public WebElement phone;
	
	@FindBy (css = "[id='7'] label")
	public List<WebElement>  AUS;
	
	@FindBy (css = "[name='_aol_app_8']")
	public List<WebElement>  PPE;
	
	@FindBy (css = "[type='submit']")
	public WebElement SubmitButton;
	
	@FindBy (css = "[id='aol_form_status']")
	public WebElement  message;
	
}
