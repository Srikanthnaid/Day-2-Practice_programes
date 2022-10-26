package Operators;

public class Distance {

	public static void main(String[] args) {
		int x = 5;
		int y = 12;
		double distance = Math.sqrt(x * x + y * y);
		System.out.println("Distance from (" + x + "," + y + ") to (0, 0) = " + distance);
	}

}
