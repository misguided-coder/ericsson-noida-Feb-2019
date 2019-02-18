package com.example.concurrency._4;

public class ThreadDemo {

	public static void main(String[] args) {

		TaskA taskA = new TaskA();
		TaskB taskB = new TaskB();

		Thread workerA = new Thread(taskA,"Worker-Pintu");
		Thread workerB = new Thread(taskB,"Worker-Jaggu");

		workerA.setPriority(10);
		workerB.setPriority(2);
			
		workerA.start();
		System.out.println("===================");
		workerB.start();
		
		System.out.println(workerA.getState());
		System.out.println(workerB.getState());
		
		System.out.println("Finish Line!!!!!");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(workerA.getState());
		System.out.println(workerB.getState());
		
	}
}

class TaskA implements Runnable {

	public void run() {
		
		System.out.println(Thread.currentThread().getState());
		
		for (int i = 1; i <= 20; i++) {
			System.out.printf("I : %s by worker %s %n", i, Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getState());
			
			/*try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getState());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}

	}
}

class TaskB implements Runnable {

	public void run() {

		System.out.println(Thread.currentThread().getState());
		
		for (int j = 1; j <= 20; j++) {
			System.out.printf("J : %s by worker %s %n", j, Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getState());
		}

	}
}
