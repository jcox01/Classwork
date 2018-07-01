package day2Assignment2;

// This is being done as an exercise in looping as well as printing.

public class PrintPattern {

	public static void main(String[] args) {

		String newString = "";
		
		for (int j = 1; j <= 4; j++) {
			
			for (int i = 1; i <= 5; i++) {
				if (i < 5) {
					newString += "* ";
				}
				else {
					newString += "*";;
				}
			}	
			System.out.println(newString);
			newString = "";
		}

	}

}
