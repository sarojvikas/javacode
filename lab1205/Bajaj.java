package lab1205;

public class Bajaj extends Bike 			// subclass from bike
{
	
	public Bajaj(Engine engine, Wheel wheel, String name) {
		super(engine, wheel, name);
		
	}

	
	@Override
	void start() {	
		System.out.println("Bajaj " +name + " is starting > ");
	}

	@Override
	void move() {
		System.out.println(getClass() +"  " +name + " is moving.....");	
	}

	@Override
	void stop() {
		System.out.println(name + " is stopped!!!");		
	}
	
	
}
