package basics;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {

		sumOfOdds();
	}

	static void sumOfOdds() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your number : ");
		int num = sc.nextInt();
		int count = 1;
		int sum = 0;

		while (count <= num) {
			if (count % 2 != 0) {
				sum += count;
			}
			count++;
		}
		System.out.println("sum of all odd numbers : " + sum);
		sc.close();
	}
	

}
