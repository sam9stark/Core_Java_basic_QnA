package basics;

public class SumPositive {

	public static void main(String[] args) {
		System.out.println("Add positives only");
		int arr[] = { 1, 2, 4, 8, -8, -7, -4, 1, -4 };
		int sum = 0;
		for (int i : arr) {
			if (i < 0) {
				continue;
			} else {
				sum += i;
			}

		}
		System.out.println(sum);
	}
}
