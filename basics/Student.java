package basics;

public class Student {

	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		Student s = new Student("Samir", 18);
		System.out.println(s);
	}
}
