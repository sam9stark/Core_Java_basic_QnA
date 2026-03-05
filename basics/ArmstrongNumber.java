package basics;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to armstrong number...");
		System.out.println("enter your number : ");

		int num = sc.nextInt();

		isArmstrong(num);
		sc.close();
	}

	public static void isArmstrong(int num) {
		int originalNum = num;
		int digits = noOfDigits(num);
		int power;
		int sumPower = 0;

		while (num > 0) {
			int temp = num % 10;
			power = power(temp, digits);
			sumPower = sumPower + power;
			num = num / 10;
		}
		if (sumPower == originalNum) {
			System.out.println("Its an Armstrong Number");
		} else {
			System.out.println("Its NOT Armstrong Number");
		}
	}

	public static int power(int num1, int num2) {
		int result = 1;
		int i = 0;

		while (i < num2) {
			result = result * num1;
			i++;
		}
		return result;
	}

	public static int noOfDigits(int num) {
		int temp = 0;
		while (num > 0) {

			num = num / 10;
			temp++;
		}
		return temp;
	}

}
