package IfCondition;

import java.util.Scanner;

public class voterAge {

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What is your name? ");
	String name = keyboard.nextLine();
	
	System.out.println("What is your age? ");
	int age = keyboard.nextInt();
	
	if (age < 18) 
	
		System.out.println(name+ ", you are to young to vote.");
	
	else 
		
		System.out.println(name+ ", you are old enough to vote, congratulations");
		
	keyboard.close();
	
	}
	

}
