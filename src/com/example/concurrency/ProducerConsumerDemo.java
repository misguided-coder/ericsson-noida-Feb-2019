package com.example.concurrency;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		new ProducerConsumerDemo();

		/*try {
			TimeUnit.SECONDS.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/

		//System.out.println("Main Over!!!!!");
	}

	public ProducerConsumerDemo() {

		LinkedList<Integer> integers = new LinkedList<>();

		Thread workerA = new Thread(new Producer(integers), "ProducerThread");
		Thread workerB = new Thread(new Consumer(integers), "ConsumerThread");

		workerA.start();
		workerB.start();
		
		System.out.printf("Thread %s is waiting for others to finish!!!",Thread.currentThread().getName());

		try {
			workerA.join();
			workerB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class Producer implements Runnable {

	LinkedList<Integer> integers = null;

	public Producer(LinkedList<Integer> integers) {
		this.integers = integers;
	}

	public void run() {
		while (true) {
			synchronized (integers) {
				if (!integers.isEmpty()) {
					try {
						integers.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				integers.addLast((int) (Math.random() * 5000));
				System.out.printf("Writing Done by %s.%n", Thread.currentThread().getName());
				integers.notify();
			}
		}
	}
}

class Consumer implements Runnable {

	LinkedList<Integer> integers = null;

	public Consumer(LinkedList<Integer> integers) {
		this.integers = integers;
	}

	public void run() {
		while (true) {
			synchronized (integers) {
				if (integers.isEmpty()) {
					try {
						integers.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int value = integers.removeFirst();
				System.out.printf("Consumed : %s%n", value);
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				integers.notify();
			}
		}
	}
}
