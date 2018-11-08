package lab7;

/*
Name: Tong Hong Lun Alan
Student ID:55479369
Lab Session: LB 3
*/

import java.util.Scanner;

public class PasswordValidator

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String u; //user name
		String p; //password
		//this do while loop only runs when the user name is NOT -1		
		do {
			//program asks for user name and password
			System.out.print("Enter user name: ");
			u = sc.nextLine();
			
			System.out.print("Enter password: ");
			p = sc.nextLine();
			
			//determines if it is valid
			if (validate(u, p))
			{
				System.out.println("Password is valid.");
				System.out.println();		
			}
				
		} while (!u.equals("-1"));	
	}
	
	//this method determines whether is password is valid
	public static boolean validate(String u, String p)
	{
		boolean x = true;
		
		if (!(p.length()>6 && p.length()<11))
		{ 
			System.out.println("Password should be within 7 to 10 characters in length.");
			x = false;
		}
		
		if (!(p.matches(".*[A-Z].*")))		
		{
			System.out.println("Password should contain at least one upper-case alphabet.");
			x = false;
		}
		
		if (!(p.matches(".*[a-z].*")))
		{
			System.out.println("Password should contain at least one lower-case alphabet.");
			x = false;
		}
			
		if (!(p.matches(".*[^A-Za-z0-9 ].*")))
		{
			System.out.println("Password should contain at least one special character.");
			x = false;
		}
		
		if (p.matches(".*\\s.*"))
		{
			System.out.println("Password should not contain whitespace.");
			x = false;
		}
		
		if (p.contains(u))
		{
			System.out.println("Password should not contain or be the same as user name.");
			x = false;
		}
		
		return x;
	}
}