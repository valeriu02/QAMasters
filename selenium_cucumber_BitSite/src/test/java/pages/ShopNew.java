package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SingletonBrowser;

public class ShopNew {

	public ShopNew(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
//	@FindBy(css="[data-test='homepageHeroPanelShopNewButton']")
//	public WebElement buttonShopNew;
	
	
	
	public void clickShopNew(WebDriver driver) {
		
		driver.findElement(By.cssSelector
				("[data-test='homepageHeroPanelShopNewButton']")).click();
	}
	
	public static void selectModel(WebDriver driver , String model) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List <WebElement> list = driver.findElements(By.cssSelector("[data-qa $= 'new'] [class ^='d-inline-block']"));
		for (int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals(model)) {
				list.get(i).click();
			}
			
		}
	}
	
public static void selectBodyType(WebDriver driver, String bodyType) {
	
	driver.findElement(By.cssSelector(("[data-test-item='"+ bodyType + "']"))).click();
}

public static void zipCode(WebDriver driver, String zip) {
	driver.findElement(By.cssSelector("[placeholder = 'ZIP Code']")).sendKeys(zip);
}

public static void next(WebDriver driver) {
	driver.findElement(By.cssSelector("[data-test = 'nextButton']")).click();
}

public static void skip (WebDriver driver) {
	WebElement  skip ;
	WebDriverWait wait= new WebDriverWait (driver , 20 );
	skip = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test='configuratorSkipButton']")));
	skip.click();
}

//public static void header(WebDriver driver) {
//	
//	WebDriverWait wait= new WebDriverWait (driver , 20 );
//	WebElement header = driver.findElement(By.cssSelector("[data-qa='vehicleHeaderYearMakeModel']"));
//     wait.until(ExpectedConditions.visibilityOf(header));
// String header1 = header.getText();
//}


@FindBy (css ="[data-test='vehicleHeaderYearMakeModel']")
public WebElement header;


@FindBy (css="[data-test='configSummaryStyleName']")
public WebElement style;


@FindBy ( css = "[class='text-nowrap']:nth-of-type(1)")
public WebElement features;
}


