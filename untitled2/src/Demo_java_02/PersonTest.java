package Demo_java_02;

import Demo_java_02.Student;

public class PersonTest {
	
	public static void main(String[] args) {
		Student s=new Student("计算机科学与技术");
		s.eat();
		s.walk(20);
		System.out.println("****************");
		s.study();
		Person person=new Person();
		person.eat();
	}

}
