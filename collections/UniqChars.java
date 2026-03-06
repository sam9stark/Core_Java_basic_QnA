package collections;

import java.util.HashSet;
import java.util.Set;

public class UniqChars {

	public static void main(String[] args) {
		Set<Character> s = new HashSet<>();

		String str = "munnibadnamhuidarlingtereliye";
		for (char c : str.toCharArray()) {
			s.add(c);
		}
		System.out.println("unique charaters in the string are :  \n" + s);
	}
}
