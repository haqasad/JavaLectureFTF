package com.ftf.lecture.five;

abstract public class Animal {

	private String name;
	private String food;
	private String location;
	private String habitat;

	public Animal(String name, String food, String location, String habitat) {
		this.name = name;
		this.food = food;
		this.location = location;
		this.habitat = habitat;		
	}
	
	public void eat() {
		System.out.println("The animal eats " + this.food);
	}
	
	public void place() {
		System.out.println("The animal lives in " + this.location);
	}
	
	public abstract void sleep();
	
	public abstract void roam();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
}
