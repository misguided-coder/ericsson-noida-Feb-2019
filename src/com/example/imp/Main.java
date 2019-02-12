package com.example.imp;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		// UC1();
		//UC2();
		UC3();
	}
		
	void UC3() {

		Course course1 = new Course("Hibernate", 350000.00);
		//Course course2 = new Course("Hibernate", 350000.00);
		Course course2 = new Course("Spring", 750000.00);
		
		System.out.println(course1.hashCode());
		System.out.println(course2.hashCode());
	}


	void UC2() {

		Course course1 = new Course("Hibernate", 350000.00);
		//Course course2 = new Course("Spring", 750000.00);
		 Course course2 = new Course("Hibernate", 350000.00);

		System.out.println(course1 == course2);
		System.out.println(course1.equals(course2));
	
		System.out.println(course1.getClass());
	}

	void UC1() {
		Course course = new Course("Hibernate", 350000.00);

		System.out.println(course.getTitle());
		System.out.println(course.getPrice());
		System.out.println(course.toString());
		System.out.println(course.hashCode());

	}
}
