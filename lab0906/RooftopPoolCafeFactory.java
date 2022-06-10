package lab0906;

import java.util.Scanner;

public class RooftopPoolCafeFactory {
	
	Scanner sc = new Scanner(System.in);
	
	License getLicense()			// method for creating custom license object
	{
		boolean flag;
		
		System.out.println("Enter deposit amount : ");
		double amt = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Fire Extinguisher is availbe or not ? Y/N");
		String check = sc.nextLine();
		
		if(check.equalsIgnoreCase("y") || check.equalsIgnoreCase("yes"))
		{
			 flag = true;
		}
		
		else
		{
			flag = false;
		}
		
		return new License(101, amt, flag);				// returning custom license object
	}

	RooftopPoolCafe getRooftopPoolCafe()			// method for runtime cafe object creation
	{
		
		
		System.out.println("Tell me which cafe u want to visit : ");
		String cafename = sc.nextLine();
		
	
		
		if(cafename.equalsIgnoreCase("Rohit"))
		{
			return new CafeRohit(getLicense());
		}
		
		else if(cafename.equalsIgnoreCase("Nisha"))
		{
			return new CafeNisha(getLicense());
		}
		
		else return null;			// if not find any available type 
		
	}
	
}
