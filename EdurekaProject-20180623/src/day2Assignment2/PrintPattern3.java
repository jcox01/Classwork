package day2Assignment2;

//This is being done as an exercise in looping as well as printing.

public class PrintPattern3 {

	public static void main(String[] args) {
		
		String newString = "";
		int i = 5;
		for (int j = 1; j <= 5; j++) {
			
			do {
				if (i == 5) {
					newString += "*";
					i--;
				}
				else {
					newString += " *";
					i--;
				}
				
			} while (i >= j);
			
			i = 5;
			System.out.println(newString);
			newString = "";
		}
	}
}
