package coreprogramprojects;

import java.util.Scanner;

public class LeapYear {
	public static void main(String [] args) {
		 Scanner Sc =new Scanner(System.in);
		System.out.println("Emter The Year:");
		int year = Sc.nextInt();
		System.out.println(leapyears(year));
		
		
		
	}

	 static boolean leapyears(int year) {
		// TODO Auto-generated method stub
	
		boolean check= false;
		if (year %4 ==0)
		{
			check = true;
		}
			if(year% 100 == 0)
			{
				check = (year % 400 == 0);
			}
			return check;
		}
	}

