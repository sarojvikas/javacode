package lab1205;

public class Rider {
	
	String name;
	String dl;
	
	public Rider(String name, String dl) {
		super();
		this.name = name;
		this.dl = dl;
		
		System.out.println("Rider Details  : " + " NAME -> "+ name + " DL No : "+ dl);
	}
	
	void ride(Bike b)
	{
		b.start();
		b.move();
		b.stop();
	}

	

}
