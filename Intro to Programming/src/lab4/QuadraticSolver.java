package lab4;



/*
Name: Tong Hong Lun Alan
Student ID:55479369
Lab Session: LB 3
*/

import java.util.Scanner;

public class QuadraticSolver 
//start of class
{
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		
		//program welcomes user to Quadratic Solver
		System.out.println("Welcome to Using Quadratic Solver");
		System.out.println("=================================");
				
		//programs ask user to inpur Variable a,b and c
		System.out.print("Please enter the value of a: ");
		double a = x.nextDouble();
		
		System.out.print("Please enter the value of b: ");
		double b = x.nextDouble();
		
		System.out.print("Please enter the value of c: ");
		double c = x.nextDouble();
		
		//system calculates the 2 possible answers.
		double x1 = ( (-b + Math.sqrt ( Math.pow(b,2) - (4*a*c) ) ) / (2*a)  );
		double x2 = ( (-b - Math.sqrt ( Math.pow(b,2) - (4*a*c) ) ) / (2*a)  );
		
		//system prints out the 2 possible answers
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}
}