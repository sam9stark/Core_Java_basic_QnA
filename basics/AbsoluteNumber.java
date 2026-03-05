package basics;

import java.util.Scanner;

public class AbsoluteNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		int num1 = sc.nextInt();

		absolute(num1);
		sc.close();
	}

	private static void absolute(int num1) {
		int abs = num1 < 0 ? -(num1) : num1;
		System.out.println("absolute number is : " + abs);
	}

}
