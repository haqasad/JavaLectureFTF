package com.ftf.lecture.five;

public class Dog extends Canine implements Pet {
	
	private String noise;
	
	public Dog(String name, String food, String location, String habitat) {
		super(name, food, location, habitat);
		this.noise = "Woof";
	}
	
	public void sleep() {
		System.out.println("The dog is nocturnal"); 
	}
	
	public void roam() {
		System.out.println("The dog does not have a pack"); 
	}
	
	public boolean isFriendly() {
		return true; 
	}
	
	public void play() {
		System.out.println("The dog is not very playful");
	}	

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}
}
