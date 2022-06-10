package lab1205;

import java.util.Scanner;

public class BikeMain {

	private static void callBike(Bike b) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter driver name & dl number : ");
		String dname = sc.nextLine();
		String dl = sc.nextLine();
		
		sc.close();
		
		Rider r = new Rider(dname, dl);			// rider object creation with user input
		
		r.ride(b);
	}
	
	public static void main(String[] args) {

		Bike b = new BikeFactory().getBike();
		
		if(b != null)				// if bike type user input is neither bajaj or honda
		{	
			callBike(b);
		}
		
		else 
		{
			System.out.println("Bike not available !");
		}
		

	}

}
