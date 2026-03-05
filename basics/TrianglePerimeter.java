package basics;

import java.util.Scanner;

public class TrianglePerimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter length of the triangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int triangle = a+b+c;
		
		System.out.println("perimeter of triangle is : "+triangle);;
		sc.close();
	}
}
