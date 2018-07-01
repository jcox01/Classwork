package day2;

public class GreatestOf3 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 23;
		int num3 = 47;
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 (" + num1 + ") is greater then num 2 (" 
					+ num2 + ") and num3 (" + num3 +")");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 (" + num2 + ") is greater then num 1 (" 
					+ num1 + ") and num3 (" + num3 +")");
		}
		else if (num3 > num1 && num3 > num2) {
			System.out.println("num3 (" + num3 + ") is greater then num 1 (" 
					+ num1 + ") and num2 (" + num2 +")");
		}
		else if (num1 == num2 && num1 == num3) {
			System.out.println("num1 (" + num1 + ") , num2 (" + num2 + 
					") and num3 (" + num3 + ") are all equal");
		}
		else if (num1 == num2 && num1 > num3) {
			System.out.println("num1 (" + num1 + ") and num2 (" + num2 
					+ ") are equal but greater then num3 (" + num3 + ")");	
		}
		else if (num1 == num3 && num1 > num2) {
			System.out.println("num1 (" + num1 + ") and num3 (" + num3 
					+ ") are equal but greater then num2 (" + num2 + ")");
		}
		else 
			System.out.println("num2 (" + num2 + ") and num3 (" + num3 
					+ ") are equal but greater then num1 (" + num1 + ")");
			
			
	}
	

}
