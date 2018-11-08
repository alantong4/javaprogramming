
/*
 Name Tong Hong Lun Alan
 SID : 55479369
 */
import java.util.Scanner;
public class Flower
{
	public static void main(String[] args)
	{
		int g = 0; // flower
		int a=0; // price of each flower
		int d=0; // discount
		int t=0; // final pay price
		int n=0; // number of flowers
		double m=0; // discounted amount amount
		int p=0; // original price
		double o=0; //percentage discount

		do {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input the type of flower: ");
		g = sc.nextInt();

		//test if input is -1, if it is break and jump to end of do while
		if (g == -1) 
			break;
		
		
		//test if flower type is valid
		if (g>4 || g<1) 
			System.out.println("Unknown Type");
		
		
		else if (!(g>4 || g<1))
		{
		System.out.print("Please input the number of flowers: ");
		n = sc.nextInt();
		
		//prints flower prices for each type of flower
		
		p=10*g; //p is price of the specific type of flower
		a= 10*g; //p is price of the specific type of flower
		d = (p * n); //original price
		
		for (int i = 1; i<=n;++i) //loops up to the number of flowers ordered
		{
			System.out.print("The ");
			System.out.printf("%2d" ,i);
			System.out.println("th flower's price is: HKD "+ a);
			t += a; // for counting final price
			if (a>0.5*p) --a; //price keeps decreasing until half of original
		}
			
		m = d - t; //discount is equal to original-final
		o = 100*(m/d); //discount percentage (doesn't work)

		System.out.println("Payment amount: HKD "+ t + ".");
		System.out.print("Discounted amount: HKD "+ m + "; Discount: ");
		System.out.printf("%-2.2f", o);
		System.out.println("% off.");
		System.out.println("");

		t = 0;
		}	
		
		} while (g != -1);
		
		//when input is -1 then input stop is printed
		System.out.print("Input Stop");
	}

}
