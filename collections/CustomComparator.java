package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ball", "Apple", "Donkey", "Zebra");
		System.out.println(list);
		decendingComparator(list);
		System.out.println(list);
	}

	public static void decendingComparator(List<String> StringList) {
		Collections.sort(StringList, new Comparator<String>() {

			public int compare(String s1, String s2) {
				if (s1.equals(s2)) {

					return 0;
				} else if (s1.charAt(0) < s2.charAt(0)) {
					return -1;
				} else {
					return 1;
				}

			}

		});
	}
}
