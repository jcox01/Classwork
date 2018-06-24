package testing;

import java.util.*;

public class keyboard2 {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in); 
        System.out.println("Type C to convert from Fahrenheit to Celsius or" + 
        "F to convert from Celsius to Fahrenheit."); 
        char choice = Keyboard.nextLine().charAt(0);
        //Get user input on whether to do F to C or C to F 
        if (choice == F) //Fahrenheit to Celsius
            { 
                System.out.println("Please enter the temperature in Fahrenheit:"); 
                double C = Keyboard.nextDouble();
                double SaveC = C;
                C = (((C-32)*5)/9);
                System.out.println(SaveC + " degrees in Fahrenheit is equivalent to " + C + " degrees in Celsius."); 
            } 
        else if (choice == C) 
            { 
                System.out.println("Please enter the temperature in Celsius:"); 
                double F = Keyboard.nextDouble(); 
                double SaveF = F;
                F = (((F*9)/5)+32); 
                System.out.println(SaveF +" degrees in Celsius is equivalent to " + F + " degrees in Fahrenheit."); 
            } 
        else if (choice != C && choice != F) 
            { 
                System.out.println("You've entered an invalid character.");
            } 

	}

}
