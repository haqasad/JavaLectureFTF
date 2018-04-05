package com.ftf.lecture.six.javagenerics;

public class TestGen {

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
		
		System.out.println("=================================================");
		
		Container<Integer> container = new Container<Integer>();
		container.addItem(1);
		container.addItem(2);
		container.addItem(3);
		container.addItem(4);
		container.addItem(5);
		
		container.printAll(); 
		
		System.out.println("=================================================");
		
		String[] words = { "Mary", "had", "a", "little", "lamb" };
		Pair<String> pair = ArrayAlg.minmax(words);
		System.out.println("min = " + pair.getFirst());
		System.out.println("max = " + pair.getSecond()); 		
		
		System.out.println("=================================================");
		
		Integer[] intArray = new Integer[5];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 12;
		intArray[4] = 15;
		
		Stats<Integer> statsInt = new Stats<Integer> (intArray);
		double intAvg = statsInt.average();
		System.out.println("Average of numbers: " + intAvg);
		
		Double[] doubleArray = {1.5, 2.6, 3.3, 4.4, 5.9};
		Stats<Double> statsDoub = new Stats<Double> (doubleArray);
		double doubAvg = statsDoub.average();
		String strMsg = String.format("Average of numbers: %.2f", doubAvg);
		System.out.println(strMsg);		
	}
}
