package forLoop;

public class Reverse {
	public void findReverseNumber() {
		int n = 12345;
		int rev = 0;
		for (int i = 0; i <= n; i++) {

		}
		System.out.print("original number->" + n);
		for (;n!=0;) {
			int remainder = n % 10;
			rev = (rev * 10) + remainder;
			n = n / 10;
		}
		System.out.print("\n Reverse number->" + rev);
	}

	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		reverse.findReverseNumber();

	}

}
