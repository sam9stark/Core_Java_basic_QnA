package collections;

import java.util.Arrays;
import java.util.List;

public class ALReverse {

	public static void reverse(List<Integer> list) {
		System.out.println(list);

		for (int i = 0; i < list.size() / 2; i++) {
			int swap = list.get(i);
			list.set(i, list.get(list.size() - 1 - i));
			list.set(list.size() - 1 - i, swap);

		}
//		System.out.println(list);
//		Collections.reverse(list);
		System.out.println(list);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		reverse(list);
	}
}
