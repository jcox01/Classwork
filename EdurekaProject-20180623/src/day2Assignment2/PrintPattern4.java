package day2Assignment2;

//This is being done as an exercise in looping as well as printing.

public class PrintPattern4 {

	public static void main(String[] args) {
		String newString = "";
		int i = 1;
//		boolean tabOnly = true;
		
		for (int j = 1; j <= 5; j++) {

			if ((j == 1) || (j == 5)) {
				newString += "\t\t*";
				//i++;
			}
			
			if (j == 3) {
				for (i = 1; i <= 5; i++) {
					if (i == 1) {
						newString += "*";
						
					}
					else {
						newString += "\t*";
						
					}
				}
			}
				
			else if ((j == 2) || (j == 4)){
				for (i = 1; i <= 3; i++) {
						newString += "\t*";
				}
			}
			
			i = 1;
			System.out.println(newString);
			newString = "";
		}
	}
}
