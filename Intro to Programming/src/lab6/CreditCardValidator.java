package lab6;


/*
Name: Tong Hong Lun Alan
Student ID:55479369
Lab Session: LB 3
*/

import java.util.Scanner;

public class CreditCardValidator 
//start of class

{
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		int a = 0; //used to double the numbers
		int b = 0; //used to sum the numbers
		String c; //used for user input		
		
		do {
			System.out.print("Enter the credit card number: ");
			c = x.nextLine();
			//to check if card length and starting digits are valid
			if ((c.length()>13 && (c.length()<17) && (c.charAt(0)=='4' || c.charAt(0)=='5' || c.charAt(0)=='6' || c.substring(0,2)=="37")))
			{
				//doubles every even digit from right to left then add
				for(int z=c.length()-2;z>-1;z-=2)
				{
					a = Integer.parseInt(c.substring(z, z+1));
					a *= 2;
					if (a>=10)
					{
					a = (a/10) + (a%10); 
					}	
					b += a;					
				}
				
				//adds every odd digit from right to left 
				for(int y=c.length()-1;y>0;y-=2)
				{
					a = Integer.parseInt(c.substring(y,y+1));	
					b += a;	
				}
				
				//sums the numbers up and determines whether it is divisible by 10
				if (b%10==0)
				{
					System.out.println("The card is valid \n");
				}
				
				else 
				{
					System.out.println("The card is invalid \n");
				}
			}
			
			//ends if user inputs -1
			else if (c.equals("-1"))
			{
				System.out.println("End");
				break;
			}
			
			else
			{
				System.out.println("The card is invalid \n");			
			}
			
		} while (!c.equals("-1"));			
	}
}
