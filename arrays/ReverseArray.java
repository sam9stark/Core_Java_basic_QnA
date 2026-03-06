package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		System.out.println("Welcome to reverse array");
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Original Array : " + Arrays.toString(arr));
//		int[] revArray = reverse(arr);
//		System.out.println("Reverse Array : " + Arrays.toString(revArray));
		reverse(arr);
	}

//	public static int[] reverse(int[] arr) {
//		int[] revArray = new int[arr.length];
//		for (int i = 0, j = arr.length - 1; i < arr.length; i++) {
//			revArray[i] = arr[j];
//			j--;
//		}
//		return revArray;
//	}
	public static void reverse(int[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			int swap = arr[i];
			arr[i] = arr[(arr.length-1)-i];
			arr[(arr.length-1)-i]=swap;
		}
		System.out.println("Reverse Array : " + Arrays.toString(arr));

	}
}
