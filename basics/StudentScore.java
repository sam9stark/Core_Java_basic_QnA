package basics;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your mark : ");
		int mark = sc.nextInt();

		grade(mark);
		sc.close();
	}

	private static void grade(int mark) {
		String score = mark > 80 && mark <= 100 ? "High"
				: mark >= 50 && mark <= 80 ? "Moderate" : mark < 50 && mark >= 0 ? "Low" : "invalid mark";
		System.out.println("this student got a score : " + score);
	}
}
