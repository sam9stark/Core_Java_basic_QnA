package basics;

import java.util.Scanner;

public class GussingGame {

	int random;

	GussingGame() {
		random = (int) (Math.ceil(Math.random() * 100));
	}

	int guess(int guessNumber) {
		return guessNumber - random;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to gusessing game , guess a number between 1 to 100");
		Scanner sc = new Scanner(System.in);
		GussingGame gg = new GussingGame();
		int num;
		do {
			System.out.println("guess the number : ");
			num = gg.guess(sc.nextInt());
		} while (num != 0);
		{
			if (num < 0) {
				System.out.println("guess highier");
			} else {
				System.out.println("guess lower");
			}

		}
		System.out.println("guess correctly");
		sc.close();
	}
}
