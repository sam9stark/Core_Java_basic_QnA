package oops;

import java.util.Arrays;

public class Course {

	static int maxCapacity = 10;
	static String[] enrolledStudents;

	String courseName;
	int enrolledStudent;

	Course(String courseName) {
		this.courseName = courseName;
		enrolledStudents = new String[maxCapacity];
	}

	static void setmaxCapacity(int capacity) {
		Course.maxCapacity = capacity;

	}

	void enrollStudent(String studentName) {
		enrolledStudents[enrolledStudent] = studentName;
		enrolledStudent++;
		System.out.println("Student enrolled");
	}

	void unenrolledStudent(String studentName) {
		for (int i = 0, j = 0; i < enrolledStudents.length; i++) {
			if (enrolledStudents[i] != studentName) {
				enrolledStudents[j] = enrolledStudents[i];
			}
		}
		System.out.println("Student removed");
	}

	public static void main(String[] args) {
		Course java = new Course("java");
		java.enrollStudent("Samir");
		System.out.println(Arrays.toString(enrolledStudents));
		java.unenrolledStudent("Samir");
		System.out.println(Arrays.toString(enrolledStudents));

	}
}