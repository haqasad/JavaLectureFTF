package com.ftf.lecture.five;

abstract public class Canine extends Animal {
	
	public Canine(String name, String food, String location, String habitat) {
		super(name, food, location, habitat); // super() ==> Animal() ; Canine canine = new Canine("dog", "meat", "asia", "domestic")
	}

}
