package com.ftf.lecture.five;

public class Wolf extends Canine {
	
	public Wolf(String name, String food, String location, String habitat) {
		super(name, food, location, habitat);		
	}
	
	public void sleep() {
		System.out.println("The wolf is nocturnal"); 
	}
	
	public void roam() {
		System.out.println("The tiger has a pack"); 
	}	

}
