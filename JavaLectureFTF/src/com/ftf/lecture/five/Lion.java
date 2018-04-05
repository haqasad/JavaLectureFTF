package com.ftf.lecture.five;

public final class Lion extends Faline {
	
	public Lion(String name, String food, String location, String habitat) {
		super(name, food, location, habitat);		
	}
	
	public void sleep() {
		System.out.println("The lion is nocturnal"); 
	}
	
	public void roam() {
		System.out.println("The lion has a pack"); 
	}	

}
