package com.example.synchronizors;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class BarrierDemo {

	public static void main(String[] args) {
		new BarrierDemo();
	}

	public BarrierDemo() {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
	
		new Thread(new PicnicTask(cyclicBarrier, "Nanital-Winter-Holiday",10L), "Pintu").start();
		new Thread(new PicnicTask(cyclicBarrier, "Nanital-Winter-Holiday",4L), "Jaggu").start();
		new Thread(new PicnicTask(cyclicBarrier, "Nanital-Winter-Holiday",2L), "Chandu").start();
		new Thread(new PicnicTask(cyclicBarrier, "Nanital-Winter-Holiday",8L), "Ghanshu").start();

		new Thread(new PicnicTask(cyclicBarrier, "Nanital-Winter-Holiday",4L), "Salmankhan").start();
		new Thread(new PicnicTask(cyclicBarrier, "Nanital-Winter-Holiday",2L), "Shahrukkhan").start();
		new Thread(new PicnicTask(cyclicBarrier, "Nanital-Winter-Holiday",7L), "Amitabh").start();
		//new Thread(new PicnicTask(cyclicBarrier, "Nanital-Winter-Holiday",5L), "Rajnikant").start();

	}
}

class PicnicTask implements Runnable {

	CyclicBarrier cyclicBarrier = null;
	String name = null;
	long timeToReach = 0L;

	public PicnicTask(CyclicBarrier cyclicBarrier, String name,long timeToReach) {
		this.cyclicBarrier = cyclicBarrier;
		this.name = name;
		this.timeToReach = timeToReach;
	}

	@Override
	public void run() {
		try {
			System.out.printf("%s started from home!!!!%n", Thread.currentThread().getName());
			TimeUnit.SECONDS.sleep(this.timeToReach);
			System.out.printf("%s reached at the barrier point and waiting for others to reach!!!!%n",
					Thread.currentThread().getName());
			//this.cyclicBarrier.await();
			this.cyclicBarrier.await(20L,TimeUnit.SECONDS);
			System.out.printf("%s started ahead for %s picnic journey with others!!!!%n",
					Thread.currentThread().getName(), this.name);
			TimeUnit.SECONDS.sleep(5);
			System.out.printf("%s enjoying food and snacks with others!!!!%n", Thread.currentThread().getName());
			TimeUnit.SECONDS.sleep(2);
			System.out.printf("%s enjoying hills and mountains with others!!!!%n", Thread.currentThread().getName());
			TimeUnit.SECONDS.sleep(2);
			System.out.printf("%s enjoying hotel accomodation with others!!!!%n", Thread.currentThread().getName());
			TimeUnit.SECONDS.sleep(2);
			System.out.printf("%s leaving back to home with others!!!!%n", Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
			System.out.printf("%s leaving the barrier point and going back to home!!!!%n", Thread.currentThread().getName());
		} catch (TimeoutException e) {
			e.printStackTrace();
			System.out.printf("%s leaving the barrier point and going back to home coz time out alarm!!!!%n", Thread.currentThread().getName());
		}
	}
}
