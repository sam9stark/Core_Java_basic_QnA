package basics;

import java.util.Scanner;

public class CircleCircumference {
	static int radius;

	public static double circuference(int radius) {
		double pi = Math.PI;
		return 2 * pi * radius;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of the circle : ");
		radius = sc.nextInt();

		System.out.println(circuference(radius));
		sc.close();
	}

}
