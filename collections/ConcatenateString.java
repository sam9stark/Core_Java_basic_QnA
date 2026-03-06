package collections;

public class ConcatenateString {

	public StringBuilder concate(String first, String... strings) {
		StringBuilder s = new StringBuilder();
		for (String str : strings) {
			s = s.append(str);
		}
		return s;
	}

	public static void main(String[] args) {
		ConcatenateString cs = new ConcatenateString();

		System.out.println(cs.concate("hello", "samir", "kya ", "kar rahe ho"));
		System.out.println();
	}
}
