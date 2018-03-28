package com.ftf.lecture.four;

//======================================================================
//Subject:	Inheritance Example
//Author:	Asadul Haque
//Date:		03/22/2018
//======================================================================

public class Canine extends Animal {

	@Override
	public void eat() {
		System.out.println("The animal eats food like canine");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("The animal makes noise like canine");
	}
	
	@Override
	public void roam() {
		System.out.println("The animal hunts like a canine");
	}
}
