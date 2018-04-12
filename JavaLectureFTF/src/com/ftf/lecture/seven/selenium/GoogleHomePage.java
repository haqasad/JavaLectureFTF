package com.ftf.lecture.seven.selenium;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ftf.lecture.seven.javaproperty.GoogleProperties;

public class GoogleHomePage {
	
	private final String googleUrl = "src/resources/property-files/google.property";
	private final String driverPath = "C:/Users/haqasad/Drivers/chromedriver.exe";
	private final String searchBoxXpath = ".//*[@id='lst-ib']";
	
	WebDriver driver;
	GoogleProperties googleProperties;
	
	public void invokeUrl(Properties property) {

		googleProperties = new GoogleProperties();
		
		googleProperties.initialize(property, googleUrl); 
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(googleProperties.getLink());
	}
	
	public void googleSearch(String keys) {
		
	     WebElement searchBox = driver.findElement(By.xpath(searchBoxXpath));
	     searchBox.sendKeys(keys);
	     searchBox.submit();	
		
	}

}
