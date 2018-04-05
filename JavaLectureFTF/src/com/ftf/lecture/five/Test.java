package com.ftf.lecture.five;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Lion lion = new Lion("lionking", "meat", "asia", "domestic");
		System.out.println("line 8: " + lion.getName());
		
		lion.setName("lionqueen");	
		System.out.println("line 11: " + lion.getName());
		
		lion.setName("lionprice");	
		System.out.println("line 14: " + lion.getName());
		
		System.out.println("========================================");
		
		Lion lion1 = new Lion("lion_1", "meat", "asia", "domestic");
		System.out.println("line 19: " + lion1.getName());
		
		lion1.setName("lion_2");	
		System.out.println("line 22: " + lion1.getName());
		
		lion.setName("lion_3");	
		System.out.println("line 25: " + lion.getName());
		
		System.out.println("========================================");
		
		Tiger tiger = new Tiger("Cyber Tooth", "Meat", "Asia", "Wild");
		Cat cat = new Cat("Tom", "Fish", "Earth", "Domestic");
		
		ArrayList<Faline> falineList = new ArrayList<Faline>();
		falineList.add(cat);
		falineList.add(lion);
		tiger.otherFalines(falineList); 
	}

}
