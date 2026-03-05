package basics;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int k = i; k < num - 1; k++) {
				System.out.print("  ");
			}
			for (var j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		sc.close();
	}
}
