package basics;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to reverse number...");
		System.out.println("enter your number : ");
		int num = sc.nextInt();
		int reverse = reverse(num);
		System.out.println("Reverse number : "+ reverse);
		sc.close();
	}
	public static int reverse(int num)
	{
		int r = 0;
		while(num > 0) {
			r =r *10 + num % 10;
			num = num/10;
		}
		return r;
	}
}
