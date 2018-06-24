package testing;

import java.util.Scanner;

public class KeyboardIO {

	public static void main(String[] args) {
	
//		private static Scanner in;
		Scanner in = new Scanner(System.in);
		System.out.println("What is your age?");
		String age = in.nextLine();
		
		in.close();
		
		System.out.println("Your age is : " +age);
	}

}
