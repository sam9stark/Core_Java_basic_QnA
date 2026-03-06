package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryAndCapitals {

	public static String getCapitals(Map<String, String> countryMap, String country) {
		return countryMap.get(country);
	}

	public static void main(String[] args) {
		Map<String, String> country = new HashMap<>();

		country.put("India", "New Delhi");
		country.put("Japan", "Tokyo");
		country.put("China", "Beijing");
		country.put("Germany", "Berlin");
		country.put("France", "Paris");

//		System.out.println(getCapitals(country));

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the country name to get the capital : ");
		String input = sc.next();

		if (country.containsKey(input)) {
			System.out.println(getCapitals(country, input));
		} else {
			System.out.println("sorry we don't know the capital");
		}
		sc.close();

	}
}
