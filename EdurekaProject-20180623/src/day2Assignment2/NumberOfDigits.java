package day2Assignment2;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to count digits of");
		Scanner keyboard = new Scanner(System.in);
		
		int num = keyboard.nextInt();
		int length = String.valueOf(num).length();
		
		System.out.println("The number you entered has \"" + length + "\" digits.");
		keyboard.close();
	}
	
}
