package com.example.concurrency._1;

public class ThreadDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			System.out.printf("I : %s%n", i);
		}

		System.out.println("===================");

		for (int j = 1; j <= 20; j++) {
			System.out.printf("J : %s%n", j);
		}
		
		System.out.println("Finish Line!!!!!");

	}

}
