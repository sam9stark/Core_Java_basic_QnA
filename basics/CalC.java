package basics;

import java.util.Scanner;

public class CalC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to CalC...");
		System.out.println("enter your 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("enter your 2nd number : ");
		int num2 = sc.nextInt();
		System.out.println("enter your operator : ");
		String operator = sc.next();
		monthOfTheYear(num1, num2, operator);
		sc.close();
	}

	private static void monthOfTheYear(int num1, int num2, String operator) {
		int cal = switch (operator) {
		case "+" -> num1 + num2;
		case "-" -> num1 - num2;
		case "*" -> num1 * num2;
		case "/" -> num1 / num2;
		default -> -1;
		};
		System.out.println("the given calculation is : " + cal);
	}
}
