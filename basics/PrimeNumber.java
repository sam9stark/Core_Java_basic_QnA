package basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("welcome to prime number...");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = sc.nextInt();

		String s = isPrime(num);
		System.out.println(s);
		sc.close();
	}

	public static String isPrime(int num) {
		int i = 2;
		while (i < num) {
			if (num % i == 0) {
				return num + " is not a prime number";
			}
			i++;
		}
		return num + " is a prime number";
	}
}
