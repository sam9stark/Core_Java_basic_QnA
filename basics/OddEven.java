package basics;

import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Check your number is odd or even");
	System.out.println("enter your number : ");
	
	int num = sc.nextInt();
	
	if(num%2==0) {
		System.out.println("given number is even");
	}
	else
	{
		System.out.println("given number odd");

	}
	sc.close();
}
}
