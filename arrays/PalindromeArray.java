package arrays;

import java.util.Arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		System.out.println("Welcome to reverse array");
		int[] arr = { 1, 2, 3, 3, 2, 1, };
		System.out.println("Original Array : " + Arrays.toString(arr));

		if (isPalindrome(arr) == true) {
			System.out.println("given array is a palindrome");
		} else {
			System.out.println("given array is not a palindrome");
		}

	}

	public static boolean isPalindrome(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {

			if (arr[i] != arr[(arr.length - 1) - i]) {
				return false;
			}

		}
		return true;
	}
}
