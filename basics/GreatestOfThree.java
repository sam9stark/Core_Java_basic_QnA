package basics;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		System.out.println("welcome to number checker...");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your 1st number : ");
		int num1= sc.nextInt();
		
		System.out.println("enter your 2nd number : ");
		int num2 = sc.nextInt();
		
		System.out.println("enter your 3rd number : ");
		int num3 =sc.nextInt();
		
		if(num1 >= num2 && num1 >= num3)
		{
			System.out.println(num1 + " 1st is the greatest of three");
		}
		else if(num2 >= num3)
		{
			System.out.println(num2 + " 2nd is the greatest of three");
		}
		else
		{
			System.out.println(num3 + " 3rd is the greatest of three");
		}
		sc.close();
	}
}
