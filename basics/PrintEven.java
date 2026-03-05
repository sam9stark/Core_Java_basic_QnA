package basics;

public class PrintEven {

	public static void main(String[] args) {
		System.out.println("Print even only");
		int arr[] = { 1, 3, 2, 4, 3, 8, 5 };
		for (int i : arr) {
			if (i % 2 != 0) {
				continue;
			} else {
				System.out.println(i);

			}

		}
	}
}
