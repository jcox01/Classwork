package testing;

import java.util.Scanner;

public class MakeTable2 {

	  public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    System.out.println("Input the number of students");
	    int numofstu = input.nextInt();
	    double totalchange = 0;
	    for (int count = numofstu; count != 0; count--){
	      if (count == numofstu)
	      System.out.println("Last Name \t\t StartWeight \t\t End Weight \t\t Weight Change");
	      System.out.print("Enter student name: ");
	      String name = input.next();
	      System.out.print("Input start weight: ");
	      double start = input.nextDouble();
	      System.out.print("Enter end weight: ");
	      double end = input.nextDouble();
	      double change = (start - end);
	      totalchange += change;
	      System.out.println(name + "\t\t" + start + "\t\t\t" + end + "\t\t\t" + change);
	    }
	    double avg = totalchange / numofstu;
	    System.out.println("Average weight change: " + avg);
	  }
}