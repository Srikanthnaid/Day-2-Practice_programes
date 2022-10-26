package ifelse;

import java.util.Scanner;

public class ReadNumber {
	public void readNumberAndDisply() {
		Scanner input = new Scanner(System.in);
		int hundreds = 0;
		int tens = 0;
		int ones = 0;
		System.out.println("Enter a 3 digit number:");
		int number = input.nextInt();
		if (number <= 999 && number > 99) {
			hundreds = number / 100;
			System.out.println("Hundreds place digit:" + hundreds);
			tens = (number - (hundreds * 100)) / 10;
			System.out.println("\n Tens place digit:" + tens);
			ones = (number - (tens * 10) - (hundreds * 100));
			System.out.println("\n Ones place digit:" + ones);
		} else {
			if (number > 999)
				System.out.println("\n Error! Number more than 3 digits");
			if (number < 100)
				System.out.println("Error! Number less than 3 digits:");
		}

	}

	public static void main(String[] args) {
		ReadNumber number = new ReadNumber();
		number.readNumberAndDisply();
	}

}
