package com.ftf.lecture.six.setexamples;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		Set<String> cities = new LinkedHashSet<>();
		
		cities.add("Dhaka");
		cities.add("New York");
		cities.add("Kolkata");
		cities.add("Tokyo"); 
		cities.add("London");
		cities.add("Tokyo");
		
		System.out.println(cities); 		
	}

}
