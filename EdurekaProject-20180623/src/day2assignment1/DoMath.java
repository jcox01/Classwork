package day2assignment1;

public class DoMath {

	public static void main(String[] args) {
		// add, subtract, multiply, div, mod two numbers
		
		int num1 = 7;
		int num2 = 23;
		
		System.out.println("addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("multiply: " + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println("division: " + num2 + " / " + num1 + " = " + ((float)num2 / (float)num1));
		System.out.println("modulus: " + num2 + " % " + num1 + " = " + (num2 % num1));
		
	}

}
