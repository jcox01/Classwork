package IfCondition;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter the number to check.");
	int num = keyboard.nextInt();
	
	if ((num % 2) == 0)
		System.out.println("The number " + num + " is even.");
		
	else
		System.out.println("The number " + num + " is odd.");
	
	keyboard.close();
	
	}

}
