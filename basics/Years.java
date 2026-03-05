package basics;

import java.util.Scanner;

public class Years {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to months...");
		System.out.println("enter your month number : ");
		int month = sc.nextInt();

		monthOfTheYear(month);
		sc.close();
	}

	private static void monthOfTheYear(int month) {
		String monthName = switch (month) {
		case 1 -> "January";
		case 2 -> "February";
		case 3 -> "March";
		case 4 -> "April";
		case 5 -> "May";
		case 6 -> "June";
		case 7 -> "July";
		case 8 -> "August";
		case 9 -> "September";
		case 10 -> "October";
		case 11 -> "November";
		case 12 -> "Decemeber";
		default -> "invalid month number";
		};
		System.out.println("the given month is : " + monthName);
	}
}
