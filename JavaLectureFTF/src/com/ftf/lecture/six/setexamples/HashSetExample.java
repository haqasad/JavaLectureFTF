package com.ftf.lecture.six.setexamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> cities = new HashSet<>();
		
		cities.add("Dhaka");
		cities.add("New York");
		cities.add("Kolkata");
		cities.add("Tokyo"); 
		cities.add("London");
		cities.add("Tokyo");
		
		System.out.println("Total cities: " + cities.size()); 
		System.out.println(cities); 
	}

}
