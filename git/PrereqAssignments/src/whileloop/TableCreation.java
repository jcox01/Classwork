package whileloop;

public class TableCreation {

	public static void main(String[] args) {
		
		int size = 10;
		System.out.format("       ");
		int i = 1;
		int j = 1;
		while (i <= size) {
			System.out.format("%4d", i);
			i++;
		}	
		System.out.println();
		System.out.println("-----------------------------------------------");
		i = 1;
		while (i <= size) {
			System.out.format("%4d  |", i);
			j = 1;
			
			while (j <= size) {
				System.out.format("%4d", i*j);
				j++;
			}
			i++;
			System.out.println();
		}
		
	}

}
