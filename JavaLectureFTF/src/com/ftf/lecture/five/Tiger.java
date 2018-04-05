package com.ftf.lecture.five;

import java.util.ArrayList;

public class Tiger extends Faline {
	
	public Tiger(String name, String food, String location, String habitat) {
		super(name, food, location, habitat);		
	}
	
	public void sleep() {
		System.out.println("The tiger is nocturnal"); 
	}
	
	public void roam() {
		System.out.println("The tiger does not have a pack"); 
	}	

	public <T extends Faline> void otherFalines(ArrayList<T> falineList) {
		System.out.println("The animals (other than Tiger) that belongs to Faline family: "); 
		for (Faline faline: falineList) {
			System.out.println("\n" + faline.getName());
		}
	}
}
