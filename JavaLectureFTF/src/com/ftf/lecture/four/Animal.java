package com.ftf.lecture.four;

//======================================================================
//Subject:	Class Example
//Author:	Asadul Haque
//Date:		03/22/2018
//======================================================================

public class Animal {
	
	private String food;
	private String location;
	private int hunger;
	private String habitat;
	
/*	//===========================================================
	// CONSTRUCTOR - 1
	//===========================================================
	
	public Animal() {
		
		this.food = "Meat";
		this.location = "Africa";
		this.hunger = 3;
		this.habitat = "Wild";
		
	}
		
	//===========================================================
	// CONSTRUCTOR - 2
	//===========================================================
	
	public Animal(String food, String location, int hunger, String habitat) {
		
		this.food = food;
		this.location = location;
		this.hunger = hunger;
		this.habitat = habitat;
		
	}*/

	//===========================================================
	// GETTER SETTER
	//===========================================================
	
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

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	//===========================================================
	// METHODS
	//===========================================================
	
	public void eat() {
		System.out.println("The animal eats " + food);
	}
	
	public void makeNoise() {
		System.out.println("The animal makes noise");
	}
	
	public void sleep() {
		System.out.println("The animal is nocturnal");
	}
	
	public void roam() {
		System.out.println("The animal hunts in pack");
	}

}
