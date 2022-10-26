package WhileLoop;

public class ReverseNumber {
	public void findReverseNmber() {
		int number = 9876543, r = 0;
		while (number != 0) {
			int remainder = number % 10;
			r = r * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of given number is:" + r);

	}

	public static void main(String[] args) {
		ReverseNumber  number = new ReverseNumber();
		number.findReverseNmber();
	}

}
