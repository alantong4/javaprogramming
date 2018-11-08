package lab4;



/*
Name: Tong Hong Lun Alan
Student ID:55479369
Lab Session: LB 3
*/

import java.util.Scanner;

public class DigitSeparator 
//start of class

{
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		
		//ask user of 5 digit integer input and stores as variable
		System.out.print("Enter a five-digit integer: ");
		int i = x.nextInt();
		
		
		//program calculates and prints the separated number
		System.out.print("Digits in " + i + " are ");
		System.out.print(i/10000);
		System.out.print("   ");
		System.out.print((i%10000)/1000);
		System.out.print("   ");
		System.out.print((i%1000)/100);
		System.out.print("   "); 
		System.out.print((i%100)/10); 
		System.out.print("   "); 
		System.out.print((i%10));
	}
}

	