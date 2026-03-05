package basics;

import java.util.Scanner;

public class PrimeNumUsinfForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check its prime or not : ");

		int num = sc.nextInt();
		isPrime(num);
		sc.close();
	}

	public static void isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;

			}
		}
		if (count == 2) {
			System.out.println("given number is prime number");
		} else {
			System.out.println("given number is not a prime number");
		}
	}
}
