package basics;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Fibonacci Series...");
		System.out.println("enter your number : ");
		int num = sc.nextInt();
		fibonacci(num);
		
		sc.close();
	}
	public static void fibonacci(int num) {
	int n1 = 0;
	int n2 =1;
	int  i =num;
	while(i > 0) {
		System.out.println(n1 +"_____"+n2);
		int next =n1+n2;
		n1 = n2;
		n2 = next;
		i--;
	}
	}
}
