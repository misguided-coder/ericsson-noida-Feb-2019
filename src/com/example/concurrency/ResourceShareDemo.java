package com.example.concurrency;

public class ResourceShareDemo implements Runnable {

	double swissBalance = 1000000.00;

	public static void main(String[] args) {
		new ResourceShareDemo();
	}

	public ResourceShareDemo() {

		Thread workerA = new Thread(this, "Worker-Kejriwal");
		Thread workerB = new Thread(this, "Worker-Rahul");

		workerA.start();
		workerB.start();

		System.out.println("Finish Line!!!!!");
	}

	public void run() {
		System.out.println("Travelling to airport!!!");
		System.out.println("Calling a cab!!!");
		System.out.println("Going to hotel!!!");
		System.out.println("Having dinner!!!");
		synchronized(this)  {
			System.out.printf("Swiss Account Balance of %s is : %s !!!!%n", Thread.currentThread().getName(), swissBalance);
			swissBalance = swissBalance - 1000000.00;
		}
	}

	/*
	 * public synchronized void run() {
	 * System.out.printf("Swiss Account Balance of %s is : %s !!!!%n",Thread.
	 * currentThread().getName(),swissBalance); try { Thread.sleep(10000); } catch
	 * (InterruptedException e) { e.printStackTrace(); } swissBalance = swissBalance
	 * - 1000000.00; }
	 */
}
