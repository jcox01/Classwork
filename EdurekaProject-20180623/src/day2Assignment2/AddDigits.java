package day2Assignment2;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {

		
		System.out.println("Enter the number to add the digits of.");
		Scanner keyboard = new Scanner(System.in);
		
		int num = keyboard.nextInt();
		
		String numString = Integer.toString(num);
		int length = numString.length();
		
		int result = 0;
		int digit;
		char achar = '0';
		for (int i = 0; i <= (length - 1); i++) {
			achar = numString.charAt(i);
			digit = Character.getNumericValue(achar);
			result += digit; 
		}
		
		System.out.println("The numbers total up to " + result);
		keyboard.close();
	}

}
