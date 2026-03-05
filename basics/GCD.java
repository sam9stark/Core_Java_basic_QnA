package basics;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to GCD");
		
		System.out.println("enter you first number : ");
		int first =  sc.nextInt();
		System.out.println("enter your second number : ");
		int second = sc.nextInt();
		
		int gcd = gcd(first,second);
		System.out.println("GCD of two given number is : "+ gcd);
		sc.close();
	}
	
	public static int gcd(int first, int second) {
		int gcd = 1;
		
		int i = 2;
		int least = least(first,second);
		
		while(i <= least) {
			 if(first % i ==0 && second % i==0)
			 {
				 gcd =i;
			 }
			i++;
			
		}
		
		return gcd;
	}
	
	public static int least(int num1, int num2) {
		if(num1<num2) {
			return num1;
		}else
		{
			return num2;
		}
	}
}
