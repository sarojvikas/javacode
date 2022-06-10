package lab0906;

public class License {

	int cafeId;
	double depositmoney;
	boolean fireext;
	
	
	public License(int cafeId, double depositmoney, boolean fireext) {
		super();
		this.cafeId = cafeId;
		this.depositmoney = depositmoney;
		this.fireext = fireext;
											// printing only ID and Dep Amount
		System.out.println("License Details : " + cafeId + " is ID and "+  depositmoney + " is deposit money");
		
		if(!fireext)
		{									// alert message only if Fire Ext not availalble
			System.out.println("Fire Extinguisher is not available ");
		}
	}
	
}
