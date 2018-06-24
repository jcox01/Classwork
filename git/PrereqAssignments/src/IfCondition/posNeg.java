package IfCondition;

import java.util.Scanner;

public class posNeg {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number to check case of.");
		double num = keyboard.nextDouble();
		
		if (num < 0)
			System.out.println("The number " +num+ " is negative.");
		
		else if (num > 0)
			System.out.println("The number " +num+ " is positive.");
		
		else
			System.out.println("The number " +num+ " is neither positive or negative.");
	
		keyboard.close();
	}

}
