package coreprogramprojects;

import java.util.Scanner;

public class PowerProgram {
	public static void main(String []args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the First Power Number:");
		int Num =Sc.nextInt();
		System.out.println("Enter the Second Power Number:");
		int power = Sc.nextInt();
		
		int num=1;
		for (int i=1; i<=power ; i++)
		{
			num =num*Num;
		}
			System.out.println("Power of two Number:" +num);
			System.out.println();
			
	}
}
