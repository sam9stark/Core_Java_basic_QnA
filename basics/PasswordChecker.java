package basics;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		System.out.println("check your password...\n");
		Scanner sc = new Scanner(System.in);
		String password;

		do {
			System.out.println("enter a valid password : ");
			password = sc.next();
		} while (!checkPassword(password));
		{
			System.out.println("correct password");

		}
		sc.close();
	}

	public static boolean checkPassword(String password) {
		return password.length() >= 6;
	}
}
