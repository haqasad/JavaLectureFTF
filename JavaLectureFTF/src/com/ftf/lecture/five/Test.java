package com.ftf.lecture.five;

public class Test {

	public static void main(String[] args) {

		Generic<Integer> iObj;
		
		iObj = new Generic<Integer>(88);
		
		iObj.showType();
		int v = iObj.getObj();
		System.out.println("Value: " + v);
		
		Generic<String> strOb = new Generic<String>("This is a Generics Test");
		strOb.showType();
		String str = strOb.getObj();
		System.out.println("Value: " + str);
		
		System.out.println("================================================="); 
		
		Tuple<String, String> tuple = new Tuple<>("Hello", "World");
		tuple.showTypes(); 
		
		Tuple<String, Integer> person = new Tuple<>("Rahim", 45);
		person.showTypes(); 
		
		System.out.println("=================================================");
		
		Tuple<String, Tuple<Integer, Integer>> tupleInsideTuple_1 = 
				new Tuple<String, Tuple<Integer, Integer>>("Tuple", new Tuple<Integer, Integer>(45, 89));
		
		System.out.println(tupleInsideTuple_1.getX());
		System.out.println(tupleInsideTuple_1.getY());
		
		
		System.out.println("=================================================");
		
		Tuple<String, Tuple<Integer, Integer>> tupleInsideTuple_2 = 
				new Tuple<>("Tuple", new Tuple<>(45,89));
		tupleInsideTuple_2.showTypes(); 
	}
}
