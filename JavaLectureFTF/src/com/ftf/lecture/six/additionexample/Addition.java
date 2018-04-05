package com.ftf.lecture.six.additionexample;

public class Addition<T extends Number> {

	public int intAdd(int num_1, int num_2) {
		return num_1+num_2;
//		System.out.println(num_1 + num_2); 
	}
	
	public double doubAdd(double num_1, double num_2) {
		return num_1+num_2;
//		System.out.println(num_1 + num_2); 
	}
	
	public double add(T num_1, T num_2) {
	  	return num_1.doubleValue() + num_2.doubleValue();
//		System.out.println(num_1.doubleValue() + num_2.doubleValue());  
	} 
}
