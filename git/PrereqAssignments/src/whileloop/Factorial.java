package whileloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		double result = 1d;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number to Generate a Factorial for");
		double fact = keyboard.nextDouble();
		double i = 1d;
		
		while (i <= fact) {
			result *= i;
			i++;
		}
			
		System.out.println(result);
		keyboard.close();
	
	}

}
