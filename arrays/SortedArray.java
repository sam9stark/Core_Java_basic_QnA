package arrays;

public class SortedArray {

	public static void main(String[] args) {
		System.out.println("Welcome to Arrays Sorting Check post");
//		int[] numArr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] numArr = { 9, 8, 7, 5, 4, -1 };

		boolean inc = isIncreasing(numArr);
		boolean dec = isDecreasing(numArr);

		if (inc || dec) {
			System.out.println("Given Array is a Sorted Array");
		} else {
			System.out.println("given Array is Not Sorted");
		}

	}

	public static boolean isIncreasing(int[] numArr) {
		for (int i = 1; i < numArr.length; i++) {
			if (numArr[i] < numArr[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isDecreasing(int[] numArr) {
		for (int i = 1; i < numArr.length; i++) {
			if (numArr[i] > numArr[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
