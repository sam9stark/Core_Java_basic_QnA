package basics;

import java.util.Scanner;

public class RecursionPalindrome {

	public static void main(String[] args) {
		System.out.println("check your String is Palindrome or not");
		Scanner sc =  new Scanner (System.in);
		String str = sc.next();
		System.out.println(str.substring(0, str.length()-1));
		System.out.println("Your String is " + ((isPalindrome(str))  ?
				"Palindrome" : "not palindrome"));
				sc.close();
	}
	
	public static boolean isPalindrome(String str)
	{
		if(str.length() <= 1)
		{
			return true;
		}
		int lastPos = str.length()-1;
		if(str.charAt(0) != str.charAt(lastPos)) {
			return false;
		}
		String newStr = str.substring(1, lastPos);
		return isPalindrome(newStr);
	}
}
