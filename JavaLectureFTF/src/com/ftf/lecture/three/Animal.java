package com.ftf.lecture.three;

//======================================================================
//Subject:	Class Example
//Author:	Asadul Haque
//Date:		03/15/2018
//======================================================================

public class Animal {
	
	String food = "Meat";
	String location = "Africa";
	int hunger = 3;
	String habitat = "Wild";

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