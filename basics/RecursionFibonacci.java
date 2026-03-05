package basics;

import java.util.Scanner;

public class RecursionFibonacci {

	public static void main(String[] args) {
		System.out.println("Printing fibonacci using RECURSION");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(fibonacci(i));
		}
		sc.close();
	}

	public static int fibonacci(int num) {
		if (num == 1) {
			return 0;
		}
		if (num == 2) {
			return 1;
		}

		return fibonacci(num - 1) + fibonacci(num - 2);
	}
}
