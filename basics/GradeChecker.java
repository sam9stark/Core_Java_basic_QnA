package basics;

import java.util.Scanner;

public class GradeChecker {

	public static void main(String[] args) {
		System.out.println("Welcome to Grade Checker...");
		System.out.println("Enter your percentage : ");
		Scanner sc =  new Scanner(System.in);
		int percentage = sc.nextInt();
		if(percentage >0 && percentage <=30) {
			System.out.println(percentage + " You comes Under Grade F");
		}
		else if (percentage >30 && percentage <= 60) {
			System.out.println(percentage + " You comes Under Grade D");
		}
		else if (percentage >60 && percentage <= 75) {
			System.out.println(percentage + " You comes Under Grade C");
		}
		else if (percentage >75 && percentage <= 90) {
			System.out.println(percentage + " You comes Under Grade B");
		}
		else if (percentage >90 && percentage <= 100) {
			System.out.println(percentage + " You comes Under Grade A");
		}
		else {
			System.out.println("invalid percentage");
		}
		sc.close();
	}
}
