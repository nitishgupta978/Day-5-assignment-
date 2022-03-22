package coreprogramprojects;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		double Random = Math.floor(Math.random()*2)%2;
		int Head =1;
		int Tails =0;
		double Heads =0.5;
		
		System.out.println("Toss The or Flip the Coin:");
		
		if (Random < 1)
		{
			System.out.println("The flip coin is Tails:" +Random );
		}
		else {
			System.out.println("The Flip coin is Heads:"  +Random);
		}
	
		

	}
}
