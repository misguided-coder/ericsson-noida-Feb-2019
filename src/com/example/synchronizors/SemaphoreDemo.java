package com.example.synchronizors;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {

	public static void main(String[] args) {
		new SemaphoreDemo();
	}

	public SemaphoreDemo() {
		
		Semaphore semaphore = new Semaphore(4);
		System.out.println(semaphore.availablePermits());
		
		
		ATMMachine machine1 = new ATMMachine(semaphore,"ATM-1");
		ATMMachine machine2 = new ATMMachine(semaphore,"ATM-2");
		ATMMachine machine3 = new ATMMachine(semaphore,"ATM-3");
		ATMMachine machine4 = new ATMMachine(semaphore,"ATM-4");
		
		new Thread(machine1,"Person-1").start();
		new Thread(machine2,"Person-2").start();
		new Thread(machine3,"Person-3").start();
		new Thread(machine4,"Person-4").start();
		new Thread(machine1,"Person-5").start();
		new Thread(machine2,"Person-6").start();
		new Thread(machine3,"Person-7").start();
		new Thread(machine4,"Person-8").start();
		new Thread(machine1,"Person-9").start();
		new Thread(machine2,"Person-10").start();
		
	}
}

class ATMMachine implements Runnable {
	
	Semaphore semaphore =null;
	String machineName = null;
	
	public ATMMachine(Semaphore semaphore,String machineName) {
		this.semaphore = semaphore;
		this.machineName = machineName;
	}
	
	@Override
	public void run() {
		try {
			this.semaphore.acquire();
				System.out.printf("%s acquired permit and available now are %s only!!!!%n", Thread.currentThread().getName(),this.semaphore.availablePermits());
				System.out.printf("%s entered in ATM Room!!!!%n", Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(2);
				System.out.printf("%s withdrawing money from ATM Machine '%s'!!!!%n", Thread.currentThread().getName(),this.machineName);
				TimeUnit.SECONDS.sleep(5);
				System.out.printf("%s collectig cash from ATM Machine '%s'!!!!%n", Thread.currentThread().getName(),this.machineName);
				TimeUnit.SECONDS.sleep(2);
				System.out.printf("%s leaving ATM Room!!!!%n", Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(2);
			this.semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
