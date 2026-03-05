package basics;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Checking the LEAP years...");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a year");

		int year = sc.nextInt();

		if (year % 400 == 0 || (year % 4 == 0 & year % 100 != 0)) {
			System.out.println("given year is a LEAP year");
		} else {
			System.out.println("given year is not a LEAP year");

		}
		sc.close();
	}

}
