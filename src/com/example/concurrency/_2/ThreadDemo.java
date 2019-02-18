package com.example.concurrency._2;

public class ThreadDemo {

	public static void main(String[] args) {

		TaskA taskA = new TaskA();
		TaskB taskB = new TaskB();
		
		taskA.doWork();
		System.out.println("===================");
		taskB.doWork();

		System.out.println("Finish Line!!!!!");

	}
}

class TaskA {

	public void doWork() {

		for (int i = 1; i <= 20; i++) {
			System.out.printf("I : %s%n", i);
		}

	}
}

class TaskB {

	public void doWork() {

		for (int j = 1; j <= 20; j++) {
			System.out.printf("J : %s%n", j);
		}

	}
}
