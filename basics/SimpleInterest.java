package basics;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter P");
		int p =sc.nextInt();
		System.out.println("enter T");
		int t = sc.nextInt();
		System.out.println("enter R");
		int r = sc.nextInt();
		
		double interest = (p*t*r)/100;
		System.out.println("Simple interest is : "+interest);
		
		sc.close();
	}
}
