package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		System.out.println("Welcome yo the array( MAX & MIN)");
		int[] arr = { 1, 2, 3, 4, 1, 2, 5, 7, 6, -1, 5, 4, 3, 2, 1, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("MAX : " + max + "\nMIN : " + min);
		sc.close();
	}
}
