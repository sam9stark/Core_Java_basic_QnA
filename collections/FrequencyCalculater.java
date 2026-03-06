package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyCalculater {

	public static int calFreq(List<Integer> list, int num) {
		return Collections.frequency(list, num);

	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 2, 5, 7, 8, 5, 96);
		int frequency = calFreq(list, 96);
		System.out.println("number of frequency : " + frequency);
	}
}
