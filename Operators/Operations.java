package Operators;

public class Operations {
	public void toPerform_ArithmeticOperations() {
		int num1 = 10, num2 = 20, C = 0;
		C = num1 + num2;
		System.out.println(C);
		System.out.println("a+b*c->" + (num1 + num2) * C);
		System.out.println("a+b/c->" + (num1 + num2) / C);
		System.out.println("a%b+c->" + (num1 % num2) + C);
		System.out.println("a*b+c->" + (num1 * num2) + C);
	}

	public static void main(String[] args) {
		Operations operations = new Operations();
		operations.toPerform_ArithmeticOperations();

	}

}
