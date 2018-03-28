package com.ftf.lecture.three;

//======================================================================
//Subject:	Test Class
//Author:	Asadul Haque
//Date:		03/14/2018
//======================================================================

public class Test {

	public static void main(String[] args) {
		
	//******************************************************************
	//							ANIMAL CLASS
    //******************************************************************
		
		
		//==============================================================
		// ANIMAL CLASS INSTANTIATION (creating object for animal class)
		//==============================================================		
		
		Animal animal1 = new Animal();
		
		//==============================================================
		// accessing all the animal class properties
		//==============================================================
		
		System.out.println("Printing all the instance variables of animal class\n");
		System.out.println(animal1.food);
		System.out.println(animal1.location);
		System.out.println(animal1.hunger);
		System.out.println(animal1.habitat);
		
		System.out.println("\nCalling all the methods of animal class\n");
		animal1.eat();
		animal1.makeNoise();
		animal1.sleep();
		animal1.roam();
		
		
	//******************************************************************
	//					ANIMALGETTERSETTER CLASS
	//******************************************************************
		
		
		//==============================================================
		// ANIMALGETTERSETTER CLASS INSTANTIATION
		//==============================================================
		
		AnimalGetterSetter animal2 = new AnimalGetterSetter();
		
		System.out.println("\nPrinting all the instance variables of AnimalGetterSetter class\n");
		System.out.println(animal2.food);
		System.out.println(animal2.location);
		System.out.println(animal2.hunger);
		System.out.println(animal2.habitat);
		
		//==============================================================
		// setting instance variable values using setter
		//==============================================================
		
		animal2.setFood("Fish");
		animal2.setLocation("Asia");
		animal2.setHunger(4);
		animal2.setHabitat("Domestic");

		//==============================================================
		// printing instance variable values by instance variable
		//==============================================================
		
		System.out.println("\nPrinting all the instance variables of AnimalGetterSetter class\n");
		System.out.println(animal2.food);
		System.out.println(animal2.location);
		System.out.println(animal2.hunger);
		System.out.println(animal2.habitat);
		
		//==============================================================
		// printing instance variable values using getter
		//==============================================================
		
		System.out.println("\nPrinting instance variables of AnimalGetterSetter class using getter\n");
		System.out.println(animal2.getFood());
		System.out.println(animal2.getLocation());
		System.out.println(animal2.getHunger());
		System.out.println(animal2.getHabitat());


	//******************************************************************
	//						ANIMALENCAPSULE CLASS
	//******************************************************************		

					
		AnimalEncapsule animal8 = new AnimalEncapsule();

		//==============================================================
		// setting instance variable values using setter
		//==============================================================
		
		animal8.setFood("Fish");
		animal8.setLocation("Asia");
		animal8.setHunger(4);
		animal8.setHabitat("Domestic");

		//==============================================================
		// printing instance variable values by instance variable
		//==============================================================
		
		//System.out.println("\nPrinting all the instance variables of AnimalEncapsulate class\n");
		//System.out.println(animal8.food);
		//System.out.println(animal8.location);
		//System.out.println(animal8.hunger);
		//System.out.println(animal8.habitat);
		
		//==============================================================
		// printing instance variable values using getter
		//==============================================================
		
		System.out.println("\nPrinting instance variables of AnimalEncapsulate class using getter\n");
		System.out.println(animal8.getFood());
		System.out.println(animal8.getLocation());
		System.out.println(animal8.getHunger());
		System.out.println(animal8.getHabitat());
		
		
	//******************************************************************
	//						ANIMALCONSTRUCTOR CLASS
	//******************************************************************		

		
		//==============================================================
		// ANIMALCONSTRUCTOR CLASS INSTANTIATION WITH CONSTRUCTOR - 1
		//==============================================================
		
		AnimalConstructor animal3 = new AnimalConstructor();
	
		//==============================================================
		// printing instance variable values
		//==============================================================
		
		System.out.println("\nPrinting instance variables of AnimalConstructor class with Constructor - 1\n");
		System.out.println(animal3.getFood());
		System.out.println(animal3.getLocation());
		System.out.println(animal3.getHunger());
		System.out.println(animal3.getHabitat());
		
		//==============================================================
		// ANIMALCONSTRUCTOR CLASS INSTANTIATION WITH CONSTRUCTOR - 2
		//==============================================================
		
		AnimalConstructor animal4 = new AnimalConstructor("Rice");
		
		System.out.println("\nPrinting instance variables of AnimalConstructor class with Constructor - 2\n");
		System.out.println(animal4.getFood());
		System.out.println(animal4.getLocation());
		System.out.println(animal4.getHunger());
		System.out.println(animal4.getHabitat());
		
		//==============================================================
		// ANIMALCONSTRUCTOR CLASS INSTANTIATION WITH CONSTRUCTOR - 3
		//==============================================================
		
		AnimalConstructor animal5 = new AnimalConstructor("Rice");
		
		System.out.println("\nPrinting instance variables of AnimalConstructor class with Constructor - 3\n");
		System.out.println(animal5.getFood());
		System.out.println(animal5.getLocation());
		System.out.println(animal5.getHunger());
		System.out.println(animal5.getHabitat());		
		
		//==============================================================
		// ANIMALCONSTRUCTOR CLASS INSTANTIATION WITH CONSTRUCTOR - 4
		//==============================================================
		
		AnimalConstructor animal6 = new AnimalConstructor("Bread", "North America", 1);
		
		System.out.println("\nPrinting instance variables of AnimalConstructor class with Constructor - 4\n");
		System.out.println(animal6.getFood());
		System.out.println(animal6.getLocation());
		System.out.println(animal6.getHunger());
		System.out.println(animal6.getHabitat());
		
		//==============================================================
		// ANIMALCONSTRUCTOR CLASS INSTANTIATION WITH CONSTRUCTOR - 5
		//==============================================================
		
		AnimalConstructor animal7 = new AnimalConstructor("Cheese", "Australia", 2, "Water");
		
		System.out.println("\nPrinting instance variables of AnimalConstructor class with Constructor - 5\n");
		System.out.println(animal7.getFood());
		System.out.println(animal7.getLocation());
		System.out.println(animal7.getHunger());
		System.out.println(animal7.getHabitat());		
		
	}

}