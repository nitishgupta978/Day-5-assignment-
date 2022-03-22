package coreprogramprojects;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args ) {
		//object of the Scanner class
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number:");
		int a =Sc.nextInt();
		System.out.println("Enter the Second Number:");
		int b = Sc.nextInt();
		System.out.println("Enter the Third Number:");
		int c =Sc.nextInt();
		
		int temp;
		int largest;
		//comparing a and b and storing the largest number in a temp variable
		temp=a>b?a:b;
		
		//comparing the temp variable with c and storing the result in the variabl
		largest=c>temp?c:temp;
		
		System.out.println("The Largest among three Number of one is : " +largest);
		
	}
}
