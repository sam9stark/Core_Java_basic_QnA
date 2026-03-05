package basics;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to palindrome number..");
		System.out.println("enter your number : ");
		int num = sc.nextInt();

		isPalindrome(num);
		sc.close();
	}

	public static void isPalindrome(int num) {
		int numCopy = num;
		int reverse = 0;
		while (num > 0) {
			int temp = num % 10;
			reverse = reverse * 10 + temp;
			num = num / 10;
		}
		if (numCopy == reverse) {
			System.out.println("its a palindrome number");
		} else {
			System.out.println("its not a palindrome number");
		}
	}
}
