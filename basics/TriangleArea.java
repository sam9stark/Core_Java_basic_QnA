package basics;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter triangle length : ");
		int b = sc.nextInt();

		System.out.println("enter height of triangle : ");
		int h = sc.nextInt();

		double area = (b * h) / 2;

		System.out.println("area of the triangle is : " + area);
		sc.close();

	}
}
