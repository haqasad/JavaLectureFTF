package com.ftf.lecture.three;

//======================================================================
//Subject:	Constructor Example
//Author:	Asadul Haque
//Date:		03/15/2018
//======================================================================

public class AnimalConstructor {
	
/*	String food = "Meat";
	String location = "Africa";
	int hunger = 3;
	String habitat = "Wild";*/

	String food;
	String location;
	int hunger;
	String habitat;
	
	//===========================================================
	// CONSTRUCTOR - 1
	//===========================================================
	
	public AnimalConstructor() {
		
		this.food = "Meat";
		this.location = "Africa";
		this.hunger = 3;
		this.habitat = "Wild";
		
	}
	
	//===========================================================
	// CONSTRUCTOR - 2
	//===========================================================
	
	public AnimalConstructor(String food) {
		
		this.food = food;
		this.location = "Africa";
		this.hunger = 3;
		this.habitat = "Wild";
		
	}
	
	//===========================================================
	// CONSTRUCTOR - 3
	//===========================================================
	
	public AnimalConstructor(String food, String location) {
		
		this.food = food;
		this.location = location;
		this.hunger = 3;
		this.habitat = "Wild";
		
	}
	
	//===========================================================
	// CONSTRUCTOR - 4
	//===========================================================
	
	public AnimalConstructor(String food, String location, int hunger) {
		
		this.food = food;
		this.location = location;
		this.hunger = hunger;
		this.habitat = "Wild";
		
	}
	
	//===========================================================
	// CONSTRUCTOR - 5
	//===========================================================
	
	public AnimalConstructor(String food, String location, int hunger, String habitat) {
		
		this.food = food;
		this.location = location;
		this.hunger = hunger;
		this.habitat = habitat;
		
	}

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
		System.out.println("The animal lives in " + location);
	}
	
	public void sleep() {
		System.out.println("The animal is nocturnal");
	}
	
	public void roam() {
		System.out.println("The animal hunts in pack");
	}

}