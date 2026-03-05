package basics;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter P");
		int p =sc.nextInt();
		System.out.println("enter T");
		int t = sc.nextInt();
		System.out.println("enter R");
		int r = sc.nextInt();
		
		double interest = p*(1+(r/100))*t;
		System.out.println("Compound interest is : "+interest);
		
		sc.close();
	}
}
