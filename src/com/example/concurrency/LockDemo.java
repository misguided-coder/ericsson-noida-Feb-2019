package com.example.concurrency;

import java.util.concurrent.TimeUnit;

public class LockDemo {

	public static void main(String[] args) {
		new LockDemo();
	}

	public LockDemo() {

		DBTask dbTask = new DBTask();

		Thread workerA = new Thread(dbTask, "Worker-Kejriwal");
		Thread workerB = new Thread(dbTask, "Worker-Rahul");

		workerA.start();
		workerB.start();

		System.out.println("Finish Line!!!!!");
	}

}

class DBTask implements Runnable {

	public void run() {
		if (Thread.currentThread().getName().contains("Kejriwal")) {
			writeData();
		}
		if (Thread.currentThread().getName().contains("Rahul")) {
			readData();
		}
	}


	public synchronized void writeData() {
		System.out.println("Creating connection to DB for writing.");
		System.out.println("Connected to DB for writing.");
		System.out.println("Writing data from DB.");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Writing Done.");
		System.out.println("Disconnected from DB.");
	}

	public synchronized void readData() {
		System.out.println("Creating connection to DB for reading.");
		System.out.println("Connected to DB for reading.");
		System.out.println("Reading data from DB.");
		System.out.println("Reading Done.");
		System.out.println("Disconnected from DB.");
	}

}
