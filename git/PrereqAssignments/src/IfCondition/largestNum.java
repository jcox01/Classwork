package IfCondition;

import java.util.Scanner;

public class largestNum {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the first number to compare.");
		int num1 = keyboard.nextInt();
		System.out.println("Enter the second number to compare.");
		int num2 = keyboard.nextInt();
		
		if (num1 < num2)
			System.out.println("The number " +num1+ " is less then " +num2+ ".");
		
		else if (num1 > num2)
			System.out.println("The number " +num2+ " is less then " +num1+ ".");
		
		else
			System.out.println("The numbers are the same size.");
		
	keyboard.close();	
	}

}
