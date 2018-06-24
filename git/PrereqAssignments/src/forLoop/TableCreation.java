package forLoop;

public class TableCreation {
// creats a multiplication table, 10 x 10
	
	public static void main(String[] args) {
		
		int size = 10;
		System.out.format("       ");
		for(int i = 1; i <= size; i++) {
			System.out.format("%4d", i);
		}	
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		for(int i = 1; i <= size; i++) {
			System.out.format("%4d  |", i);
			
			for(int j = 1; j <= size; j++) {
				System.out.format("%4d", i*j);
			}
			System.out.println();
		}
		
	}

}