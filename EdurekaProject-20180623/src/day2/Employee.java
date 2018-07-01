package day2;

public class Employee {

	int salary;
	int bonus;

	void calculateSalary(){
		int totalSalary = salary + bonus;
		
		System.out.println("Total Salary:: " + totalSalary);
	}
	
	
	int calculateSalary2(){
	
		int totalSalary = salary + bonus;
		
		return totalSalary;
	}
	
	int calculateSalary3(int x, int y){
		int totalSalary = x + y;
		
		return totalSalary;
	}
}
	
