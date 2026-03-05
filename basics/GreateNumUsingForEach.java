package basics;

import java.util.Arrays;

public class GreateNumUsingForEach {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 2, 4, 55, 6, 7, 98, 2, 7 };

		int great = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > great) {
				great = i;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("the greatest number from the array is : " + great);
	}
	
}
