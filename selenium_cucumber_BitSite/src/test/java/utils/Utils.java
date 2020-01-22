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

		list.forEach(s -> list1.add(s.getText()));

		return list1;

	}
} 
