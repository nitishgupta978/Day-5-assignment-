package coreprogramprojects;

import java.util.Scanner;

public class FactorsProgram {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of range prime Factorial:");
		int num =Sc.nextInt();
		
		int fact=1;
		for( int i=2; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("Total output of this prime factorial:" +fact);
		
		while (num>=1)
		{
			fact=fact*num;
			num=num-1;
			
		}
		System.out.println("Total output of this prime factorial:" +fact);
	}
}
