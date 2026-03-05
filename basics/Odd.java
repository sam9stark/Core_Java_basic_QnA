package basics;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		int num1 = sc.nextInt();

		isOdd(num1);
		sc.close();
	}

	private static void isOdd(int num1) {
		String odd = num1 % 2 == 0 ? "even" : "odd";
		System.out.println("given number is : " + odd);
	}
}
