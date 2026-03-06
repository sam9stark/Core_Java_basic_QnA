package oops;

import java.util.Scanner;

public class ExceptionHandling {

	int num1;
	int num2;

	public void exp(int num1, int num2) {
		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println("division by zero");

		}

	}

	public static void main(String[] args) {
		System.out.println("welcome to exception handling");
		Scanner sc = new Scanner(System.in);
		ExceptionHandling expn = new ExceptionHandling();
		System.out.println("enter 1st number : ");
		expn.num1 = sc.nextInt();
		System.out.println("enter 2nd number : ");
		expn.num2 = sc.nextInt();

		expn.exp(expn.num1, expn.num2);
		sc.close();
	}
}
