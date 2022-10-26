package SwitchCase;

import java.util.Scanner;

public class Vowels {
	public void chekVowels() {
		Scanner s = new Scanner(System.in);
		System.out.print("enter charcter:");
		char ch = s.next().charAt(0);
		ch = Character.toLowerCase(ch);// it will convert all upercase to lowercase i'e A=a;
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;
		default:
			System.out.println(ch + " is consonant");
		}
	}

	public static void main(String[] args) {
		Vowels ch = new Vowels();
		ch.chekVowels();
	}

}
