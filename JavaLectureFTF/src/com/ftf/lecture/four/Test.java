package com.ftf.lecture.four;

//======================================================================
//Subject:	Test Class
//Author:	Asadul Haque
//Date:		03/22/2018
//======================================================================

public class Test {

	public static void main(String[] args) {
		
		Canine canine = new Canine();
		canine.eat();
		
		//==============================================================
		// Inheritance Example
		//==============================================================
		
		Dog dog = new Dog();
		dog.roam();
		
		dog.setSpeed(50);
		System.out.println("\n" + dog.getSpeed() + "\n");
		
		dog.eat();

		//==============================================================
		// Polymorphism Example
		//==============================================================
		
		Animal can = new Canine();
		can.roam();
		
		Canine fan = new Dog();
		fan.roam();
		
		Animal dan = new Dog();
		dan.roam();
		
		Feline fat = new Cat();				
	}
}
