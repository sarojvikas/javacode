package lab0906;

public class CafeNisha extends RooftopPoolCafe {

	public CafeNisha(License l) {
		super(l);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void welcomeDrink() {				// Implementation of all abstract method
		System.out.println("Masala Soda !");
		
	}

	@Override
	public void ambiance() {
		System.out.println("Open air dancefloor ");
		
	}

	@Override
	public void chilling() {
		System.out.println("Mocktail counter beside pool");
		
	}

	@Override
	public void prepareKebab() {
		System.out.println("All Kebab available but Afgani is chef special");
		
	}

	@Override
	public void prepareChowmin() {
		System.out.println("Recommended Mix Chow + Chillyfish Combo");
		
	}
	
	void nishaCafeOffer()				// child class specific method 
	{
		System.out.println("30% discount within happy hours");
	}

}
