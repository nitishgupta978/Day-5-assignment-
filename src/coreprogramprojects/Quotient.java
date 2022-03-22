package coreprogramprojects;

import java.util.Scanner;

public class Quotient {
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the First int Number");
		int first = scan.nextInt();
		System.out.println("Enter the Second int Number");
		int second = scan.nextInt();
		
         System.out.println("The outputs are:");
		
		System.out.println("For Addition");
		System.out.println( first+second);
		
		System.out.println("Enter the First Floating Number");
		float firstfloat = scan.nextFloat();
		System.out.println("Enter the First Floating Nmber");
		float Secondfloat = scan.nextFloat();
		
		System.out.println("For Multipilication");
		System.out.println(firstfloat*Secondfloat);
	}
}
	
