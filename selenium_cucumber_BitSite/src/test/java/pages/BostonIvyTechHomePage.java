package pages;

import org.openqa.selenium.WebDriver;

public class BostonIvyTechHomePage {

	
	  
		 public void goToHomePage(WebDriver driver) {
			 String url = System.getProperty("url");
			 if(url==null) {
				 url = "https://bostonivytech.com/";
			 }
			 driver.get(url);
			 
		 }
	
}
