package collections;

import java.util.Arrays;
import java.util.List;

public class ALSwap {

	public static void swap(List<Integer> list, int num1, int num2) {
//		Collections.swap(list, num1, num2);
		int swap = list.get(num1);
		list.set(num1, list.get(num2));
		list.set(num2, swap);

	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(list);
		swap(list, 2, 3);
		System.out.println(list);
	}
}
