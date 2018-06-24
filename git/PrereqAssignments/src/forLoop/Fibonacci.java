package forLoop;

public class Fibonacci {

	public static void main(String[] args) {
	
		int n = 10;  // using the Golden Ratio
		double c1 = 1.618043;
		double c2 = -0.618043;
		double calc = 0;
		long result;
		
		for (int i = 0; i <= (n - 1); i++){
			
			calc = ((Math.pow(c1, i)) - (Math.pow(c2, i))) / (Math.sqrt(5));
			result = (long)calc;
			System.out.println(result);
		
		}
	}

}
