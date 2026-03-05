package basics;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		multiplication();
	}

	static void multiplication() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your number : ");
		int input = sc.nextInt();
		int i = 1;

		while (i <= 10) {
			System.out.println(input + "*" + i + " = " + input * i);
			i++;
		}
		sc.close();
	}
}
