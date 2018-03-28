package com.ftf.lecture.two;

//======================================================================
//Subject:	Array Example
//Author:	Asadul Haque
//Date:		03/08/2018
//======================================================================

public class Array {

	public static void main(String[] args) {
		
		int[] rollNum = new int[5];
		//int rollNum[] = new int[5];
		//String[] names = new String[500];
		
		//============================================
		// After this line the initial value is zero
		// rollNum[0] = 0
		// rollNum[1] = 0	
		// rollNum[2] = 0
		// rollNum[3] = 0
		// rollNum[4] = 0
		//============================================
		
		//============================================
		// ASSIGNING VALUE TO ARRAY
		//============================================
		
		rollNum[0] = 95; // rollNum[1] = 0 ... rollNum[4] = 0
		System.out.println("Roll number 1 got " + rollNum[0] + " in Maths");
		
		rollNum[1] = 85; // rollNum[2] = 0 ... rollNum[4] = 0
		System.out.println("Roll number 2 got " + rollNum[1] + " in Maths");
		
		rollNum[2] = 83;
		System.out.println("Roll number 3 got " + rollNum[2] + " in Maths");
		
		rollNum[3] = 75;
		System.out.println("Roll number 4 got " + rollNum[3] + " in Maths");
		
		rollNum[4] = 65;
		System.out.println("Roll number 5 got " + rollNum[4] + " in Maths");
	}

}
