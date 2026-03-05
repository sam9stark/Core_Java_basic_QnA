package basics;

public class ConcateAndConvert {

	public static String upperCase(String s1, String s2) {
		String newStr = s1 + " " + s2;
		return newStr.toUpperCase();
	}

	public static void main(String[] args) {
		System.out.println("convert string Uppercase");
		System.out.println(upperCase("Samir", "sahu"));
	}
}
