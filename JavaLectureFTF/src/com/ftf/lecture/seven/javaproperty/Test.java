package com.ftf.lecture.seven.javaproperty;

import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		
		Properties property = new Properties();
		DbProperties dbProperties = new DbProperties();
		GoogleProperties googleProperties = new GoogleProperties();
		
		String dbPropertyFile = "src/resources/property-files/dbconfig.property";
		String googlePropertyFile = "src/resources/property-files/google.property";
		
		dbProperties.initialize(property, dbPropertyFile); 
		
		System.out.println(dbProperties.getDriverClass()); 
		System.out.println(dbProperties.getDriver()); 
		System.out.println(dbProperties.getHostName()); 
		System.out.println(dbProperties.getPortNumber()); 
		System.out.println(dbProperties.getSid()); 
		System.out.println(dbProperties.getUserName());
		System.out.println(dbProperties.getPassword());
		
		googleProperties.initialize(property, googlePropertyFile); 
		
		System.out.println(googleProperties.getLink()); 

	}

}
