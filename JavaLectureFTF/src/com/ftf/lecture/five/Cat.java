package com.ftf.lecture.five;

public class Cat extends Faline implements Pet {
	
	private String noise;
	
	public Cat(String name, String food, String location, String habitat) {
		super(name, food, location, habitat);
		this.noise = "Mew";
	}
	
	public void sleep() {
		System.out.println("The cat is not nocturnal"); 
	}
	
	public void roam() {
		System.out.println("The cat does not have a pack"); 
	}
	
	public boolean isFriendly() {
		return false; 
	}
	
	public void play() {
		System.out.println("The cat is very playful");
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}
	
}
