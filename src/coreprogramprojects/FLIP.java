package coreprogramprojects;

import java.util.Scanner;
import java.util.Random;
public class FLIP {



	
	static  Random random=new Random();
	static Scanner sc=new Scanner(System.in);
	static float heads;
	static float tails;
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of flips");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) 
		{
            float flip = flip();
            System.out.println(flip);
            if (flip > 0.5) 
            {
                heads++;
            } else 
            	
            	if (flip < 0.5) 
            	{
                tails++;
            }
    
		
				}
		System.out.println(heads);
		System.out.println(tails);
		double percentHeads=(heads /(heads + tails))* 100;
	   double percentTails = 100 - percentHeads;	
	   
	   System.out.println("Heads"+percentHeads);
	   System.out.println("Tails"+percentTails);
	   
	   
	}
	static float flip()
	{
	
	return random.nextFloat();


	}
}

