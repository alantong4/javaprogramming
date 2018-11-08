package lab5;


/*
Name: Tong Hong Lun Alan
Student ID:55479369
Lab Session: LB 3
*/

import java.util.Scanner;

public class TriangleClassifier 
{
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		
		//program askes for user to input the 3 sides of the triangles
		System.out.print("Enter side 1: "); 
		int s1 = x.nextInt();
		
		System.out.print("Enter side 2: "); 
		int s2 = x.nextInt();

		System.out.print("Enter side 3: "); 
		int s3 = x.nextInt();
		
		//program checks if the 3 values can form a triangle
		if ( (s1+s2>s3) && (s2+s3>s1) && (s1+s3>s2) )
		{
			//program checks if the 3 values form a equilateral triangle
			if ( (s1 == s2) && (s1 == s3) )
			{
				System.out.println("The three sides form an equilateral triangle."); 		
			}	
		
			//program checks if the 3 values form a isosceles triangle
			else if ( (s1 == s2) || (s1 == s3) || (s2 == s3) )
			{
				System.out.println("The three sides form an isosceles triangle.");
			}		
			
			//program checks if the 3 values form a right-angled triangle
			else if ( Math.pow(s1,2) + Math.pow(s2,2) == Math.pow(s3,2) )
			{
				System.out.println("The three sides form a scalene triangle.");
				System.out.println("The triangle is right-angled.");
			}
			
			//program checks if the 3 values form a right-angled triangle
			else if ( Math.pow(s2,2) + Math.pow(s3,2) == Math.pow(s1,2) )
			{
				System.out.println("The three sides form a scalene triangle.");
				System.out.println("The triangle is right-angled.");
			}
		
			//program checks if the 3 values form a right-angled triangle
			else if ( Math.pow(s1,2) + Math.pow(s3,2) == Math.pow(s2,2) )
			{
				System.out.println("The three sides form a scalene triangle.");
				System.out.println("The triangle is right-angled.");
			}
		
			//if none of the above are true, program will conclude that it is a scalene triangle
			else 
			{
				System.out.println("The three sides form a scalene triangle."); 
			}
		}	
		
		//if the values do not form a triangle, program will conclude that it is invalid
		else
		{	
			System.out.println("Invalid! The three sides do not form a triangle.");
		}
		
	
	}
	
}
