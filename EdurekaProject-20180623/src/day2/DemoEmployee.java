package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		
		//Delaring an object
		Employee john;
		
		//Instantiation and Initialization
		john = new Employee();
		
//		john.calculateSalary();
		
		john.salary = 80000;
		john.bonus = 5000;
	
	int johnSalary = john.calculateSalary2();	
	System.out.println("John's Salary :: " + johnSalary);
	
	johnSalary = john.calculateSalary3(50000, 5000);
	
	System.out.println("John's Salary :: " + johnSalary);
		
	}

}
