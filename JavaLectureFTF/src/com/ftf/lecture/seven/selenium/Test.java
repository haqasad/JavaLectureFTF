package com.ftf.lecture.seven.selenium;

import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		
		Properties property = new Properties();
		GoogleHomePage homePage = new GoogleHomePage();
		
		homePage.invokeUrl(property);
		
		homePage.googleSearch("Packt Publishing"); 

	}

}
