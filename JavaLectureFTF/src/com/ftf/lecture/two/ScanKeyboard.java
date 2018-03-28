package com.ftf.lecture.two;

import java.util.Scanner;

public class ScanKeyboard {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any value from keyboard:");
		
		String keyValue = scanner.next();
		System.out.println(keyValue);

	}

}
