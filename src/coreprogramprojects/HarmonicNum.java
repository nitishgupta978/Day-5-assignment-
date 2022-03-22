package coreprogramprojects;

import java.util.Scanner;

public class HarmonicNum {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter the first Starting number:");
		int num =Sc.nextInt();
		
		System.out.println("Enter the End number:");
		int num1 =Sc.nextInt();
		
		double Har = 0.0;
		
		System.out.println("The Harmonic Series is:");
		
		for( int i=num1; i>0; i--)
		{
			Har= num+ (double) 1 /i;
			System.out.println(Har + ",");
			
			
		}
	}
}
