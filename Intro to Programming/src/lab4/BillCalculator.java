package lab4;



/*
Name: Tong Hong Lun Alan
Student ID:55479369
Lab Session: LB 3
*/

import java.util.Scanner;

public class BillCalculator 
//start of class

{
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		
		//program asks user to input name quantity and price of all 3 items.
		System.out.print("Input name of item 1: ");
		String i1 = x.nextLine();
	
		System.out.print("Input quantity of item 1: ");
		int q1 = x.nextInt();
	
		System.out.print("Input price of item 1: ");
		double p1 = x.nextDouble();
		x.nextLine();
		
		System.out.println("");
		
		System.out.print("Input name of item 2: ");
		String i2 = x.nextLine();		
	
		System.out.print("Input quantity of item 2: ");
		int q2 = x.nextInt();
	
		System.out.print("Input price of item 2: ");
		double p2 = x.nextDouble();
		x.nextLine();
		
		System.out.println("");
		
		System.out.print("Input name of item 3: ");
		String i3 = x.nextLine();
		
		System.out.print("Input quantity of item 3: ");
		int q3 = x.nextInt();
	
		System.out.print("Input price of item 3: ");
		double p3 = x.nextDouble();
		
		//program calculates the subtotal, tax and total
		double t1 = q1*p1;
		double t2 = q2*p2;
		double t3 = q3*p3;
		double sub = ((q1*p1)+(q2*p2)+(q3*p3));
		double tax = 0.0625 * sub;
		double total = sub + tax;
		
		//program prints out all the information all lined up using printf and println
		System.out.println();
		System.out.println("Your bill:");
		System.out.println();
		System.out.println("Item			      Quantity	Price	  Total");
		System.out.printf("%-30s%-10d%-10.2f%-10.2f\n",i1,q1,p1,t1);
		System.out.printf("%-30s%-10d%-10.2f%-10.2f\n",i2,q2,p2,t2);
		System.out.printf("%-30s%-10d%-10.2f%-10.2f\n",i3,q3,p3,t3);
		System.out.println();
		System.out.printf("%-50s%-10.2f\n", "Subtotal" ,sub);
		System.out.printf("%-50s%-10.2f\n", "6.25% sales tax" ,tax);
		System.out.printf("%-50s%-10.2f\n", "Total" ,total);
		System.out.println();

		
		
	}	
}
