package lab1205;

import java.util.Scanner;

public class BikeFactory {
	Scanner sc = new Scanner(System.in);
	
	Engine getEngine() 						// to get any Engine type object
	{

		System.out.println("Enter Type of Engine : ");
		String typeofengine = sc.nextLine();
		
		System.out.println("Enter Horsepower of Engine : ");
		double hp = sc.nextDouble();
		
		return new Engine(typeofengine, hp);
		
	}
	
	Wheel getWheel() 				// to get any wheel type object
	{
			
		sc.nextLine();
		System.out.println("Enter brandname of Wheel : ");
		String brand = sc.nextLine();
		
		System.out.println("Enter radius of Wheel : ");
		double radius = sc.nextDouble();
		
		return new Wheel(radius, brand);
		
	}
	
	
	Bike getBike()					// to get any bike type object
	{
		
		
		System.out.println("Enter Bike name ");
		String bikename = sc.nextLine();
		
		System.out.println("Enter Model name ");
		String modelname = sc.nextLine();
		
		
		
		if(bikename.equalsIgnoreCase("Bajaj"))
		{
			return new Bajaj(getEngine(), getWheel(), modelname);
		}
		
		else if(bikename.equalsIgnoreCase("Honda"))
		{
			return new Honda(getEngine(), getWheel(), modelname);
			
		}
			
		else
		{
			return null;				// if user input is not equal Honda or Bajaj
		}
		
	}

}
