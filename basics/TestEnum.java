package basics;

public class TestEnum {
	public static void main(String[] args) {
		System.out.println("printing 7 days of a week");
//		System.out.println(Days.values());

		for (Days s : Days.values()) {
			System.out.printf("%s : %s \n", s, s.getType());
		}
	}
}
