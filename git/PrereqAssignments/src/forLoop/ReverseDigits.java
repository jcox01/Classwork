package forLoop;

import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		int num; 
		String reverse = "";
		int i;
		System.out.println("Enter the number to reverse digits from.");
		Scanner keyboard = new Scanner(System.in);
		num = keyboard.nextInt();
		
		char achar = 0;
		String numString = Integer.toString(num);
		int length = numString.length();
		for (i = (length - 1); i >= 0 ; i--)
			{	
			achar = numString.charAt(i);
			reverse += (Character.toString(achar));
			}
		
		int result = Integer.parseInt(reverse);
		keyboard.close();
		System.out.println(result);
				
	}

}
