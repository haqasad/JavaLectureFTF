package com.ftf.lecture.one;

//======================================================================
//		Subject:	Learning about different Data Types
//		Author:		Asadul Haque
//		Date:		03/01/2018
//======================================================================

public class PrimitiveDataType {

	public static void main(String[] args) {
		
		//==================================================================
		// Data type for number (integers): byte, short, int, long	
		//==================================================================
		
		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		long d = 9223372036854775807l;
		
		System.out.println("Value of a is " + a + " and is of type byte");
		System.out.println("Value of b is " + b + " and is of type short");
		System.out.println("Value of c is " + c + " and is of type int");
		System.out.println("Value of d is " + d + " and is of type long\n\r");
		
		//==================================================================
		// Data type for decimal number (floating point): float, double	
		//==================================================================
		
		float e = 5.5860485747395f;
		double f = 9.84575647382939373;
		
		System.out.println("Value of e is " + e + " and is of type float");
		System.out.println("Value of f is " + f + " and is of type double\n\r");
		
		//==================================================================
		// Data type for character: char	
		//==================================================================
		
		char letter = 'b';
		
		System.out.println("Value of letter is " + letter + " and is of type char\n\r");
		
		//==================================================================
		// Data type for boolean: boolean	
		//==================================================================
		
		boolean val = true;
		
		System.out.println("Value of val is " + val + " and is of type boolean");
	}

}
