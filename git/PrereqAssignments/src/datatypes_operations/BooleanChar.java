package datatypes_operations;

import java.util.Scanner;

public class BooleanChar {

	public static void main(String[] args) {
		
		System.out.println("Enter the temperature to convert: ");
		Scanner keyboard = new Scanner(System.in);
		float start = keyboard.nextInt();
		
		boolean loop = false;

		do {
				
			System.out.println("Enter C to convert to Centigrade or F to convert to Fahrenheit: ");
			char choice = keyboard.next().charAt(0);
			
			float convert;
			if (choice == 'C' || choice == 'c')
				{	
					convert = (start - 32)/9*5;
					System.out.println("The converted temperature is: " + convert);
					loop = true;
				}
			else if (choice == 'F' || choice == 'f')
				{
					convert = (start/5*9) + 32;
					System.out.println("The converted temperature is: " + convert);
					loop = true;
				}
			else
				{
					System.out.println("You must use a C or F");
				}
						
		}while (loop == false);
		
		keyboard.close();
	}
	
	
}
