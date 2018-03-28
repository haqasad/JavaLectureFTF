package com.ftf.lecture.three;

//======================================================================
//Subject:	Getter Setter Example
//Author:	Asadul Haque
//Date:		03/15/2018
//======================================================================

public class AnimalGetterSetter {
	
	public String food;
	public String location;
	public int hunger;
	public String habitat;
	
	//===========================================================
	// SETTER
	//===========================================================
	
	public void setFood(String food) {
		this.food = food;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	//===========================================================
	// GETTER
	//===========================================================

	public String getFood() {
		return food;
	}

	public String getLocation() {
		return location;
	}

	public int getHunger() {
		return hunger;
	}

	public String getHabitat() {
		return habitat;
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