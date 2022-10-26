package WhileLoop;

import java.util.Scanner;

public class SumNaturalNumbers {
	public void findSumofNaturalNumbers() {
		System.out.println("Enter Natural Number:");
		Scanner obj1 = new Scanner(System.in);
		int number = obj1.nextInt();
		int sum = 0, i = 1;
		while (i <= number) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum of entered number" + sum);
	}

	public static void main(String[] args) {
		SumNaturalNumbers numbers = new SumNaturalNumbers();
		numbers.findSumofNaturalNumbers();
	}

}
