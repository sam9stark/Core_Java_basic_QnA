package basics;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to number checker...");
		System.out.println("enter your number : ");
		int num = sc.nextInt();
		
		if(num<0)
		{
			System.out.println("number is negative");
		}
		else if(num > 0)
		{
			System.out.println("number is positive");
		}
		else
		{
			System.out.println("number is zero");
		}
		sc.close();
	}
}
