package com.ftf.lecture.two;

import java.util.Scanner;

//======================================================================
//Subject:	Method Example
//Author:	Asadul Haque
//Date:		03/08/2018
//======================================================================

public class Methods {
	
	public void printArray() {
		
		int[] rollNum = new int[5];

		rollNum[0] = 95;
		System.out.println("Roll number 1 got " + rollNum[0] + " in Maths");
		
		rollNum[1] = 85;
		System.out.println("Roll number 2 got " + rollNum[1] + " in Maths");
		
		rollNum[2] = 83;
		System.out.println("Roll number 3 got " + rollNum[2] + " in Maths");
		
		rollNum[3] = 75;
		System.out.println("Roll number 4 got " + rollNum[3] + " in Maths");
		
		rollNum[4] = 65;
		System.out.println("Roll number 5 got " + rollNum[4] + " in Maths");
	}

	public void printArray(int arrayIndex) {
		
		int[] rollNum = new int[arrayIndex];

		rollNum[0] = 95;		
		rollNum[1] = 85;		
		rollNum[2] = 83;
		rollNum[3] = 75;
		rollNum[4] = 65;
		
		for (int i=0; i<rollNum.length; i++) {
			System.out.println("Roll number " + (i+1) + " got " + rollNum[i] + " in Maths");
		}		
	}

}
