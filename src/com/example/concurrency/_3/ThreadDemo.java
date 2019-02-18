package com.example.concurrency._3;

public class ThreadDemo {

	public static void main(String[] args) {
		
		TaskA taskA = new TaskA();
		TaskB taskB = new TaskB();
		
		Thread workerA = new Thread(taskA);
		Thread workerB = new Thread(taskB);
		
		workerA.start();
		System.out.println("===================");
		workerB.start();

		System.out.println("Finish Line!!!!!");

	}
}

class TaskA implements Runnable {

	public void run() {

		for (int i = 1; i <= 2000; i++) {
			System.out.printf("I : %s%n", i);
		}

	}
}

class TaskB implements Runnable {

	public void run() {

		for (int j = 1; j <= 2000; j++) {
			System.out.printf("J : %s%n", j);
		}

	}
}
