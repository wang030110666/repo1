package Demo_java_02;

import Demo_java_02.Person;

public class Student extends Person {
	
	String major;
	
	public Student(){
		
	}
	
	public Student(String major){
		this.major=major;
	}
	
	public void study(){
		System.out.println("ѧϰ,רҵ�ǣ�"+major);
	}

	public void eat(){
		System.out.println("ѧ��Ӧ�ö����Ӫ����ʳ��");
	}

	public void show(){
		System.out.println("����һ��ѧ��");
	}

	public String info(){
		return null;
	}

//	public int info1(){
//		return 1;
//	}

//	public void walk(int distance){
//		System.out.println("��д�ķ���");
//	}


	public void walk(int distance) {
		System.out.println("��д�ķ���");
	}
}
