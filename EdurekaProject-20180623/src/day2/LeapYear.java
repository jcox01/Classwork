package day2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		System.out.println("Please enter a year to check for leap year.");

		Scanner keyboard = new Scanner(System.in);
		int year = keyboard.nextInt();		
		
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
			System.out.println(year + " is a leap year, there are 366 days in the year");
		}
		else {
			System.out.println(year + " is not a leap year, there are 365 days in the year");
		}
		
		keyboard.close();
	}

}
