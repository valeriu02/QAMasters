package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopUsed {

	
	public ShopUsed(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="[data-test='homepageHeroPanelShopUsedButton']")
	public WebElement buttonShopUsed;


public static void selectBrand(WebDriver driver , String model) {
	List <WebElement> list = driver.findElements(By.cssSelector("[data-qa $= 'used'] [class ^='d-inline-block']"));
	for (int i = 0; i < list.size(); i++) {
		//System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals(model)) {
			list.get(i).click();
		}
		
	}
}


@FindBy(css="[data-qa='UsedModelDropdown']")
public WebElement buttonAllModels;



@FindBy (css="[value='6-series']")
public WebElement buttonSelectModel; 


@FindBy (css ="[data-test='usedSearchHeading']")
public WebElement header;

@FindBy (css ="[data-test='searchFiltersLocationButton']")
public WebElement city;


}



