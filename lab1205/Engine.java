package lab1205;

public class Engine {
	
	String typeofengine;
	double hp;			// Horsepower
	
	public Engine(String typeofengine, double hp) 
	{
		super();
		this.typeofengine = typeofengine;
		this.hp = hp;
		
		System.out.println("Engine Details  : " + " TYPE -> "+ typeofengine + " HORSE POWER : "+ hp);
	}
	
	

}
