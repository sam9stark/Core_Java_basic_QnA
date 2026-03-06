package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArray {
	public static void main(String[] args) {
		System.out.println("Welcome to create new array");
		int[] arr = { 1, 2, 3, 4, 1, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		int num = sc.nextInt();

		int newArr[] = new int[arr.length - size(arr, num)];

		newArr = newArray(arr, newArr, num);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		sc.close();

	}

	public static int size(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		return count;
	}

	public static int[] newArray(int[] arr, int[] newArr, int num) {

		for (int i = 0, j = 0; i < arr.length; i++) {

			if (arr[i] != num) {
				newArr[j] = arr[i];
				j++;
			}
		}
		return newArr;

	}
}
