package forLoop;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		double result = 1d;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number to Generate a Factorial for");
		
		double fact = keyboard.nextDouble();
		
		for (double i = 1; i <= fact; i++)
			
			result *= i;
			
		System.out.println(result);
		
		keyboard.close();
			
	}

}
