package day2Assignment2;

public class PrintPattern5 {

	public static void main(String[] args) {

		int i; 
		int n = 0;
		String newString = "";
		
		for (int j = 1; j <= 4; j++) {
			
			for (i = 1; i <= 4; i++) {
				if (i == 1) {
					n = j;
					System.out.print(n);
				}
				else {
					n += 2;
					System.out.format("\t" + n);
					
				}
			}
			System.out.println(newString);
			newString = "";
		}
		
		
		
		
	}

}
