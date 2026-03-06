package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfOccurances {

	public static void main(String[] args) {
		System.out.println("Welcome yo the array( number of occurence)");
		int[] arr = { 1, 2, 3, 4, 1, 2, 5, 7, 6, 1, 5, 4, 3, 2, 1, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		int num = sc.nextInt();

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("number of occurance of " + num + " is " + count);
		sc.close();
	}
}
