package com.ftf.lecture.six.listexamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> emperors = new ArrayList<>();
		
		emperors.add("Babur");
		emperors.add("Humayun");
		emperors.add("Akbar");
		emperors.add("Jahangir");
		emperors.add("Saha Jahan");
		emperors.add("Aurangzeb");
		
		System.out.println("Name of Emperors : " + emperors);
		System.out.println("Total Emperors: " + emperors.size()); 
		
		String secondEmperors = emperors.get(1);
		System.out.println("Second emperor's name: " + secondEmperors);
		
		emperors.set(2, "Akbar the Great");
		System.out.println("Name of Emperors : " + emperors);
		
//		remove 4th elements
		emperors.remove(3);
		
//		remove Aurangzeb
		emperors.remove("Aurangzeb");
		System.out.println("After removing 2 elements : " + emperors); 
		
//		Add duplicates
		emperors.add("Shah Jahan");
		System.out.println("After adding a new element : " + emperors); 
		
		int indexOfHumayun = emperors.indexOf("Humayun");
		System.out.println("Index of Humayun : " + indexOfHumayun); 
		
		int lastIndexOfShahJahan = emperors.lastIndexOf("Shah Jahan");
		System.out.println("Last index of Shah Jahan: " + lastIndexOfShahJahan); 
	}

}
