package lab5;


/*
Name: Tong Hong Lun Alan
Student ID:55479369
Lab Session: LB 3
*/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors 
{
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		Random randomGen = new Random();
		
		System.out.println("Rock-Paper-Scissors"); 
		System.out.println("==================="); 
		
		//program asks for user input 0, 1 or 2
		System.out.print("Enter 0 for rock, 1 for paper, or 2 for scissors: "); 
		int p = x.nextInt();
		
		//program generates random number from 0 to 2
		int c = randomGen.nextInt(3);
		
		//prints out the variable the user and computer chose.
		if ( p == 0 || p ==1 || p==2 )
		{
			if (p == 0)				
				System.out.println("Player picks rock."); 
		
			else if (p == 1)
				System.out.println("Player picks paper."); 
			
			else if (p == 2)
				System.out.println("Player picks scissors."); 	
			

			if (c == 0)				
				System.out.println("Computer picks rock."); 
		
			else if (c == 1)
				System.out.println("Computer picks paper."); 
			
			else if (c == 2)
				System.out.println("Computer picks scissors."); 	
		}
		//if not valid the program will notify user
		else 
			System.out.println("Invalid input!"); 
		
		
		if (p == 1 && c == 0)				 
			System.out.println("Player wins!");
			
		else if (p == 2 && c == 1)
			System.out.println("Player wins!");
		
		else if (p == 0 && c == 2)
			System.out.println("Player wins!");
		
		else if (p == 1 && c == 2)
			System.out.println("Computer wins!"); 
		
		else if (p == 2 && c == 0)
			System.out.println("Computer wins!"); 
		
		else if (p == 0 && c == 1)
			System.out.println("Computer wins!");
		
		else if (p == c)
			System.out.println("Draw game!");
	}
	
}
