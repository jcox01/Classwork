package day2Assignment2;

public class IsPrime {

	public static void main(String[] args) {

		int i = 200000917;
		double x = (double)i;
		double y = 0d;
		double sqRoot;
		int j = 0;
		sqRoot = Math.sqrt(x);
		boolean isPrime = true;
		
		y = (x / j);
		
		if ((Math.floor(sqRoot) == sqRoot)) {
			isPrime = false;
			j = (int)sqRoot;
		}
		
		else if (Math.floor(y) == y) {
			isPrime = false;
		}

		else {
			int stopPoint = (int)sqRoot;
			
			for (j = 2; j <= stopPoint; j++) {
				y = (x / j);
				if (Math.floor(y) == y){
					isPrime = false;
					break;
				}
				else {
					isPrime = true;
				}
			}
		}
		if (isPrime == false){
			System.out.println(i + " is not a prime number, it is divisible by " +j);
		}
		else {
			System.out.println(i + " is a prime number.");
		}
				
	}

}
