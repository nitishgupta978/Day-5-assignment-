package coreprogramprojects;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = read.nextInt();
			
			if(num %2 == 0) {
				System.out.println("It is even Number :" +num);	
			}
			else	{
			 
					System.out.println("It is odd Number:" +num);
			
		}

	}
	}

