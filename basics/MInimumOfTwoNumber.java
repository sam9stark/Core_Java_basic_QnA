package basics;

import java.util.Scanner;

public class MInimumOfTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first number : ");
		int num1 = sc.nextInt();
		System.out.println("enter your 2nd number : ");
		int num2 = sc.nextInt();
		
		minimumOfTwoNum(num1,num2);
		sc.close();
	}
	private static void minimumOfTwoNum(int num1, int num2) {
		int minimum = num1 < num2 ?num1 : num2;
		System.out.println("minimum number is : "+ minimum);
	}
		
}
