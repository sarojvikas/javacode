package lab0906;

public class CafeRohit extends RooftopPoolCafe {

	public CafeRohit(License l) {
		super(l);
		// TODO Auto-generated constructor stub
	}

	@Override								// Implementation of all abstract method 
	public void welcomeDrink() {
		System.out.println("Fresh lime soda upto 3 glass ");
		
	}

	@Override
	public void ambiance() {
		System.out.println("Extra ordinary city view  ");
		
	}

	@Override
	public void chilling() {
		System.out.println("Hookah is available beside pool");
		
	}

	@Override
	public void prepareKebab() {
		System.out.println("Tangri Kebab is only available ");
		
	}

	@Override
	public void prepareChowmin() {
		System.out.println("Recommended Pork Gravy Chow + Manchurian Combo");
		
	}
	
	void rohitCafeOffer()				// child class specific method 
	{
		System.out.println("Free beer if bill amount is more than 1500 !");
	}
	

}
