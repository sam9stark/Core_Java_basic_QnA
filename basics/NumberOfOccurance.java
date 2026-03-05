package basics;

import java.util.Arrays;

public class NumberOfOccurance {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 2, 4, 55, 6, 7, 98, 2, 7 };

		int num = 2;
		int count = 0;

		for (int i : arr) {
			if (i == num) {
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(num + " : " + count);
	}
}
