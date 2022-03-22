package coreprogramprojects;

import java.util.Scanner;

public class HarmonicPatternS {
	public static void main(String [] args) {
		
		Scanner Sc= new Scanner(System.in);
		
		double results=0;
		double num=0;
		int n;
		
		System.out.println("Enter the Harmonic Number what you finds:");
	
		int n1 =Sc.nextInt();
		
		for (int i=1; i<=n1; i++)
		{
			num = num+(1/i);
			results = num;
		}
		System.out.println("the Harmonic patterna are ready;" + results);
	
		
	}
}
