package lab1205;

public abstract class Bike 					// super class for all bike type
{
	
	Engine engine;			// has a relationship 
	Wheel wheel;			// has a relationship
	String name;

	public Bike(Engine engine, Wheel wheel, String name) {
		super();
		this.engine = engine;
		this.wheel = wheel;
		this.name = name;
	}
	
	
	abstract void start();
	abstract void move();
	abstract void stop();
	
	
}
