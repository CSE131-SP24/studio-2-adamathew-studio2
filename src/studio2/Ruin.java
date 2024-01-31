package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money do you start with? ");
		int startAmount = in.nextInt();
		System.out.print("What's the probability of winning, as a decimal between 0 and 1? ");
		double winChance = in.nextDouble();
		System.out.print ("What is enough money for you to go home? ");
		int winLimit = in.nextInt();
		System.out.print("How many days are you playing for? ");
		int totalSimulations = in.nextInt();
		
		
		for (int days = totalSimulations; days > 0; days -= 1)
		{
		int plays = 0;
		int money = startAmount;
		while (money < winLimit && money > 0)
		{
			 if (Math.random() < winChance)
			 {
				money++;
			 	//System.out.println("Nice! Keep playing!");
			 }
		  
			 else
			 {
				money -= 1;		 
			 //System.out.println("Ooo... Keep playing!");
		   }	
			 
			 plays++;
					
		if (money == winLimit)
		{
			int day = totalSimulations + 1 - days;
				System.out.println("Simulation "+day+": "+plays+" Win");	
		}
		
		if (money == 0)
		{
			int day = totalSimulations + 1 - days;
			System.out.println("Simulation "+day+": "+plays+" Lose");
		}
		
		}}
	}}
