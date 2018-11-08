package lab4;

/*
Name: Tong Hong Lun Alan
Student ID:55479369
Lab Session: LB 3
*/

import java.util.Scanner;

public class ChangeMaker 
//start of class

{
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		
		
		//asks user for whole number input from 1 to 99 then stores as variable
		System.out.print("Enter a whole number from 1 to 99: ");
		
		
		//calculates the number quarters, dimes, nickels and pennies.
		int c = x.nextInt();
		
		int q = c/25;
		
		int d = (c-(q*25))/10;
		
		int n = (c-(q*25)-(d*10))/5;
		
		int p = (c-(q*25)-(d*10)-(n*5));
		
		//prints out one of the possible combinations of coins 
		
		System.out.println("One combination of coins that equals to " + c + " cents is:");
		
		System.out.println(q + " quarters");
		System.out.println(d + " dimes");
		System.out.println(n + " nickels");
		System.out.println(p + " pennies");
		
		
	}
}
