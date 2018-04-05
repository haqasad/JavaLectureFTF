package com.ftf.lecture.six.additionexample;

public class Test {

	public static void main(String[] args) {
		
		Addition<Integer> addition = new Addition<Integer>();
		System.out.println(addition.intAdd(5, 6)); 
		System.out.println(addition.doubAdd(5.6, 4.4)); 
		System.out.println(addition.add(50, 50));
		
		Addition<Double> genAddition = new Addition<Double>();
		System.out.println(genAddition.add(5.6, 4.4));
		
	}

}
