package lab3;


/*
Name: Tong Hong Lun Alan
Student ID:55479369
Lab Session: LB 3
*/

import java.util.Scanner;

public class Cylinder 
//start of class
{
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);	
		
		// Program asks user to inputs cylinder's Radius and height.
		System.out.print("Enter radius of cylinder: ");
		int r = x.nextInt();
		 
		System.out.print("Enter height of cylinder: ");
		int h = x.nextInt();
		 
		/*Program Calculates the Surface Are and Volume of Cylinder 
		then prints out the Surface Area and Volume of Cylinder. */
		 
		System.out.println("Total surface area is " + (((2 * Math.PI * r) * (r + h))));
		System.out.println("Volume is " + (Math.PI * Math.pow(r,2) * h));
	}		
		
}


