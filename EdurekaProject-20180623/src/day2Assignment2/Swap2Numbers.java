package day2Assignment2;

public class Swap2Numbers {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 23;
		int swap;
		
		System.out.println("num1 = " + num1 + " and num2 = " + num2); 
		
		swap = num1;
		num1 = num2;
		num2 = swap;
		
		System.out.println("After swap");
		System.out.println("num1 = " + num1 + " and num2 = " + num2); 
			
		
	}

}
