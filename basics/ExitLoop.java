package basics;

import java.util.Scanner;

public class ExitLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = null;

		while (true) {

			System.out.println("enter the word for exiting the program");
			input = sc.next();

			if (input.equals("exit")) {
				break;
			}

		}
		System.out.println("successfully exited");
		sc.close();
	}

}
