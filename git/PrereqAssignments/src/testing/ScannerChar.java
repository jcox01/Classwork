package testing;
//Java program to read character using Scanner 
//class
import java.util.Scanner;
public class ScannerChar
{
 public static void main(String[] args)
 {
     // Declare the object and initialize with
     // predefined standard input object
     Scanner sc = new Scanner(System.in);

     // Character input
     System.out.println("enter in character");
     char c = sc.next().charAt(0);

     // Print the read value
     System.out.println("c = "+c);
 }
}