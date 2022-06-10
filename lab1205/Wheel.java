package lab1205;

public class Wheel {
	
	double radius;
	String brand;
	
	public Wheel(double radius, String brand) 
	{
		super();
		this.radius = radius;
		this.brand = brand;
		
		System.out.println("Wheel Details  : " + " RADIUS -> "+ radius + " BRAND NAME : "+ brand);
	}

}
