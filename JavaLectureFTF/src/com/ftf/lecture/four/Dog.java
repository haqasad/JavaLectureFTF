package com.ftf.lecture.four;

//======================================================================
//Subject:	Inheritance Example
//Author:	Asadul Haque
//Date:		03/22/2018
//======================================================================

public class Dog extends Canine {
	
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public void roam() {
		System.out.println("The animal hangs out with human");
	}	

}
