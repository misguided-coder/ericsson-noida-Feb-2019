package com.example._static;

public class StudentTest {
	
	Student student;

	public static void main(String[] args) {
		new StudentTest();
	}
	
	public StudentTest() {
		UC4();
	}
	
	void UC4() {
		Student student = new Student("Jaggu",78,89);
		Student.totalMarks(student.hindiMarks,student.englishMarks);
	}
	
	
	void UC1() {
		Student student1 = new Student("Jaggu",78,89);
		Student student2 = new Student("Pintu",77,80);
		System.out.println(student1);
		System.out.println(student1.MARKS);
		System.out.println(student2);
		UC2();
		//100 loc
	}

	void UC2() {
		Student student3 = new Student("Ghanshu",58,59);
		Student student4 = new Student("Chandu",18,89);
		student = student4;
		System.out.println(student3);
		System.out.println(student3.MARKS);
		System.out.println(student4);
		UC3();
	}

	void UC3() {
		Student student5 = new Student("Sudhir",98,80);
		System.out.println(student5);
	}
}
