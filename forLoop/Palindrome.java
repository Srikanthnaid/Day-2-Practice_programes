package forLoop;

public class Palindrome {
	public void checkPalindrome() {
		int n = 252;//  it give palindrome number.
		int rev = 0;
		int temp = n;// store n value.
		for (int i = 0; i <= n; i++) {

		}
		System.out.print("original number->" + n);
		for (; n != 0;) {
			int remainder = n % 10;
			rev = (rev * 10) + remainder;
			n = n / 10;
		}
		System.out.print("\n Reverse number->" + rev);

		// Checking PalindromNumber.
		if (rev == temp) {
			System.out.println("\nis palindrom");
		} else {
			System.out.println("\nIs not palindrome");
		}
	}

	public static void main(String[] args) {
		Palindrome number = new Palindrome();
		number.checkPalindrome();

	}

}
