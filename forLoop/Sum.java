package forLoop;

public class Sum {
	public void sumOfNaturalNumber() {
		int n = 5, sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("sum of " + n + " naturial numbers: " + sum);

	}

	public static void main(String[] args) {
		Sum sum = new Sum();
		sum.sumOfNaturalNumber();

	}

}
