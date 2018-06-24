package whileloop;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		int num;
		int i = 0;
		int digit; 
		int result = 0;
		System.out.println("Enter the number to add digits from.");
		Scanner keyboard = new Scanner(System.in);
		num = keyboard.nextInt();
		
		char achar = 0;
		String numString = Integer.toString(num);
		int length = numString.length();
		
		while (i <= (length -1)) {
			achar = numString.charAt(i);
			digit = Character.getNumericValue(achar);
			result += digit;
			i++;
		}
		
		keyboard.close();
		System.out.println(result);

	}

}
