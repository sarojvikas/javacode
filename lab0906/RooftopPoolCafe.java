package lab0906;

public abstract  class RooftopPoolCafe implements 
ChineseResturant,MughalResturant,SwimmingPool,Rooftop{
	
	License l;				// aggregation HAS A relationship

	public RooftopPoolCafe(License l) {
		super();
		this.l = l;
	}

}
