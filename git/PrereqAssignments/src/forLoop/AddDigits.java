package forLoop;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		int num;
		int i;
		int digit; 
		int result = 0;
		System.out.println("Enter the number to add digits from.");
		Scanner keyboard = new Scanner(System.in);
		num = keyboard.nextInt();
		
		char achar = 0;
		String numString = Integer.toString(num);
		int length = numString.length();
		for (i = 0; i <= (length -1); i++)
			{	
			achar = numString.charAt(i);
			digit = Character.getNumericValue(achar);
			result += digit;
			}
		
		keyboard.close();
		System.out.println(result);
	}

}
