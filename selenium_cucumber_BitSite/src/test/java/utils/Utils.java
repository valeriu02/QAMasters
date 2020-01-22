package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {
	
	

	public static List<String> stringlist(List<WebElement> list){

		
		SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
		WebDriver driver = sb.getDriver();
		
		
		
		List<String> list1 = new ArrayList<String>();

		list.forEach(s -> list1.add(s.getText()));package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {
	
	

	public static List<String> stringlist(List<WebElement> list){

		
		SingletonBrowser sb = SingletonBrowser.getSingletonBrowser();
		WebDriver driver = sb.getDriver();
		
		
		list = driver.findElements(By.cssSelector("[class='elementor-widget-container'] h2"));
		List<String> list1 = new ArrayList<String>();
		list.forEach(s -> list1.add(s.getText()));
		return list1;

	}
	
	
	

	}







		return list1;

	}
} 
