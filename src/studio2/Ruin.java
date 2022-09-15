package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("amount of money you start with:");
		int startAmount = in.nextInt();
		
		System.out.println("win chance:");
		double winChance = in.nextDouble();
		
		System.out.println("win limit:");
		int winLimit = in.nextInt();
		
		while (startAmount > 0 && startAmount < winLimit)
		{
			if (Math.random() <= winChance)
					{
			System.out.println( (startAmount ++) + " WIN");
					}
			else 
				{
			System.out.println( (startAmount --) + " LOSE");	
				}			
		}
		
		if (startAmount > 0)
		{
		System.out.println("you won!");
		}
		if (startAmount == 0)
		{
		System.out.println("you lost!");
		}
	}
			
}

