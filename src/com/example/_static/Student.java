package com.example._static;

public class Student {

	String name;
	public final static int MARKS = 500;
	int hindiMarks;
	int englishMarks;

	public Student() {
	}

	public Student(String name, int hindiMarks, int englishMarks) {
		this.name = name;
		this.hindiMarks = hindiMarks;
		this.englishMarks = englishMarks;
	}
	
	static void totalMarks(int param1,int param2){
		System.out.printf("MARKS : %s/%s %n",param1+param2,MARKS);
	}
}
