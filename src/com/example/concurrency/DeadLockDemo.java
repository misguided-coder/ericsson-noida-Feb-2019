package com.example.concurrency;

public class DeadLockDemo implements Runnable {

	String seatOne = "LokSabha";
	String seatTwo = "RajyaSabha";

	public static void main(String[] args) {
		new DeadLockDemo();
	}

	public DeadLockDemo() {

		Thread workerA = new Thread(this, "Worker-Kejriwal");
		Thread workerB = new Thread(this, "Worker-Rahul");

		workerA.start();
		workerB.start();

		System.out.println("Finish Line!!!!!");
	}

	public void run() {
		if (Thread.currentThread().getName().contains("Kejriwal")) {
			synchronized (seatOne) {
				System.out.printf("Kejriwal got seat : %s!!!!%n", seatOne);
				synchronized (seatTwo) {
					System.out.printf("Kejriwal got seat : %s!!!!%n", seatTwo);
				}
			}
		}
		if (Thread.currentThread().getName().contains("Rahul")) {
			synchronized (seatTwo) {
				System.out.printf("Rahul got seat : %s!!!!%n", seatTwo);
				synchronized (seatOne) {
					System.out.printf("Rahul got seat : %s!!!!%n", seatOne);
				}
			}
		}
	}

}