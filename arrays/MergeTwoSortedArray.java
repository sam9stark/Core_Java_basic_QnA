package arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		System.out.println("Welcome to Merge Array");
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int arr2[] = { 2, 4, 6, 8, 10 };

		int[] newArray = new int[arr1.length + arr2.length];
		newArray = merge(arr1, arr2);
		System.out.println(Arrays.toString(newArray));

	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (k < arr1.length || j < arr2.length) {
			if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
				newArr[k] = arr1[i];
				i++;
				k++;
			} else {
				newArr[k] = arr2[j];
				j++;
				k++;
			}
		}
		return newArr;

	}
}
