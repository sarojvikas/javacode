package Lab2306;



public class RectangleCode {

	private int length ;
	private int breadth;

	

	public int getLength() {

		return length;

	}

	public void setLength(int length) {

		if(length<= 10 || length>=50) {

			System.out.println("Length should be between 10 to 50");

		}

		this.length = length;

	}

	public int getBreadth() {

		return breadth;

	}

	public void setBreadth(int breadth) {

		if(breadth<= 5 || breadth>=20) {

			System.out.println("Breadth should be between 5 to 20");

		}

		this.breadth = breadth;

	}

	

	public RectangleCode(int length, int breadth) {

		setLength(length);

		setBreadth(breadth);

	}

	

	void getArea() {

		

		if(getBreadth()<=20 && getBreadth()>=5) {

			if(getLength()<=50 && getLength()>=10)

			{

				System.out.println(getBreadth()*getLength());

			}

			else {

				System.out.println("Length Error");

			}

		}

		else {

			System.out.println("Breadth Error");

		}

			

		

	}

	



}
