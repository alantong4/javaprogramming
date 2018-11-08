import java.util.Scanner;

public class CosTest 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		double x = 0;
		double s = 0; //used for sum of series
		
		do {
		System.out.print("Please enter the value of n: ");
		n = sc.nextInt();
		
		//breaks if n input from user is -1
		if (n == -1)
		{
			System.out.println("End");
			break;
		}
					
		System.out.print("Please enter the value of x: ");
		x = sc.nextDouble();	
	
		for (int i = 0; i<n; ++i)
		{
			s += ((Math.pow(-1,i)*(Math.pow(x,2*i)))) / (factorial(2*i));
			
		}
		
		
		
		//prints results
		System.out.println("sum of series = " + s);	
		System.out.println("       cos(x) = " + Math.cos(x));	
		System.out.println("         diff = " + (s - Math.cos(x)));
		System.out.println("");
		s = 0;
		
		
		} while (n != -1);
		
	}
	
	public static double factorial(double i)
	{		
		for (double a = i-1; a > 0; --a)	
		{
			i *=a;
		}
		
		if (i==0) return 1;
		
		else return i;		
	}
	
}
