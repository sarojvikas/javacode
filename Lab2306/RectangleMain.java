package Lab2306;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		RectangleCode obj = new RectangleCode(a, b);
		obj.getArea();
	}

}
