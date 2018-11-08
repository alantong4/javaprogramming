package lab6;


/*
Name: Tong Hong Lun Alan
Student ID:55479369
Lab Session: LB 3
*/

import java.util.Scanner;

public class TwinPrimes 
//start of class

{
	public static void main(String[] args)
	{		
		Scanner x = new Scanner(System.in);
		int round = 0; //used to store number counter
		int p = 0; //used to store user input
		int i = 0; //used for all numbers to determine where they are prime
		int c = 0; //used to count the number of twins
		
		//this do while loop only runs when the user input is NOT -1		
		do{	
			round++; //adds 1 to round and prompts user for input
			System.out.println("Round " + round + ":");
			System.out.print("Enter the search range: ");
			p = x.nextInt();
			
			//for loop to test all integers from 3 to (p-2) with intervals of 2.
			//The reason the interval is 2 is because even numbers can't be prime.
			for (i = 3; i+2<=p; i+=2) 
			{
				//if one integer is prime, program will test whether that integer+2 is also prime
				if (isPrime(i) && isPrime(i+2)) //uses "isPrime" method
				{
					//if both are prime, program will print them out
					System.out.printf("(%d,%d)",i, i+2);

					c++;
					
					//every 2 twins, the program will print line
					if (c%2 == 0)
					{
						System.out.println();
					}	
				}	
			}	
			
			//prints line if total number of twins is odd 
			if (c%2 == 1)
			{
				System.out.println();
			}
			
			//tells user how many twins there are for their input.
			if (p >= 0)
			{
				System.out.println("Number of twin primes less than or equal to " + p + " is " + c);
				System.out.println();
				c = 0;
			}	
		} while (p != -1); 
		System.out.println("End"); //when user input is -1, system will print "End"
	}
	
	//this public method is used to determine whether integer "i" is prime or not.
	public static boolean isPrime(int i) 
	//i is the tested integer
	//p is every number from 2 to i-1
	{
		for (int p=2; p<i;p++)
		{
			if (i%p == 0) return false;
		}
		return true;
	}
}
