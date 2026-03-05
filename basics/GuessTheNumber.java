package basics;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		System.out.println("check your password...\n");
		Scanner sc = new Scanner(System.in);
		int num;

		do {
			System.out.println("guess the number : ");
			num = sc.nextInt();
		} while (!checkNum(num));
		{
			System.out.println("correct guessing");

		}
		sc.close();
	}

	public static boolean checkNum(int num) {
		return num == 7;
	}
}
