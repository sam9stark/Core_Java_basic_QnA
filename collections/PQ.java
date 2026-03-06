package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {
		PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
			public int compare(Student t1, Student t2) {
				return t1.getGrade() - t2.getGrade();
			}
		});
		queue.offer(new Student("samir", 'a'));
		queue.offer(new Student("balli", 'a'));
		queue.offer(new Student("rahul", 'c'));
		queue.offer(new Student("Sachin", 'b'));
		queue.offer(new Student("bata krushna", 'e'));
		queue.offer(new Student("madana", 'd'));

		queue.poll();

		System.out.println(queue);
	}

	private static class Student {
		private String name;
		private char grade;

		public char getGrade() {
			return grade;
		}

		public Student(String name, char grade) {
			super();
			this.name = name;
			this.grade = grade;
		}

		@Override
		public String toString() {
			return "Student [name= " + name + ", grade= " + grade + "]";
		}

	}
}
