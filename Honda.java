package lab1205;

public class Honda extends Bike 			// subclass from bike
{

	
	
	public Honda(Engine engine, Wheel wheel, String name) {
		super(engine, wheel, name);
		
	}

	@Override
	void start() {	
		System.out.println("Honda " +name + " is starting > ");
	}

	@Override
	void move() {
		System.out.println((""+getClass()).substring((""+getClass()).indexOf('.')+1) +" " +name + " is moving.....");	
	}

	@Override
	void stop() {
		System.out.println(name + " is stopped!!!");		
	}

}
