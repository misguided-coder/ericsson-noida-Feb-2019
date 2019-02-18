package com.example.synchronizors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class LatchDemo {
	
	static List<String> riderPositions = new ArrayList<>();

	public static void main(String[] args) {
		new LatchDemo();
	}

	public LatchDemo() {

		CountDownLatch raceStartSignal = new CountDownLatch(1);
		CountDownLatch raceFinishSignal = new CountDownLatch(5);

		RaceCoordinator raceCoordinator = new RaceCoordinator(raceStartSignal,raceFinishSignal);

		Rider rider1 = new Rider(raceStartSignal, raceFinishSignal, "Rider-1", 16L);
		Rider rider2 = new Rider(raceStartSignal, raceFinishSignal, "Rider-2", 6L);
		Rider rider3 = new Rider(raceStartSignal, raceFinishSignal, "Rider-3", 10L);
		Rider rider4 = new Rider(raceStartSignal, raceFinishSignal, "Rider-4", 12L);
		Rider rider5 = new Rider(raceStartSignal, raceFinishSignal, "Rider-5", 4L);

		new Thread(rider1).start();
		new Thread(rider2).start();
		new Thread(rider3).start();
		new Thread(rider4).start();
		new Thread(rider5).start();

		new Thread(raceCoordinator, "HourseRide-RaceCoordinator").start();

	}
}

class RaceCoordinator implements Runnable {

	CountDownLatch raceStartSignal = null;
	CountDownLatch raceFinishSignal = null;
	
	public RaceCoordinator(CountDownLatch raceStartSignal,CountDownLatch raceFinishSignal) {
		this.raceStartSignal = raceStartSignal;
		this.raceFinishSignal = raceFinishSignal;
	}

	@Override
	public void run() {
		try {
			System.out.printf("%s is counting riders and preparing to give start signal!!!!!%n",
					Thread.currentThread().getName());
			TimeUnit.SECONDS.sleep(5);
			System.out.printf("READY !!!!!%n");
			TimeUnit.SECONDS.sleep(1);
			System.out.printf("SET !!!!!%n");
			TimeUnit.SECONDS.sleep(1);
			System.out.printf("GO !!!!!%n");
			this.raceStartSignal.countDown();
			System.out.printf("%s is waiting for race to finish!!!!!%n",
					Thread.currentThread().getName());
			this.raceFinishSignal.await();
			System.out.printf("Going the announce the results!!!!!%n");
			TimeUnit.SECONDS.sleep(1);
			System.out.printf("Hold your breaths!!!!!%n");
			TimeUnit.SECONDS.sleep(2);
			System.out.printf("Results are : %s !!!!!%n",
					LatchDemo.riderPositions);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Rider implements Runnable {

	CountDownLatch raceStartSignal = null;
	CountDownLatch raceFinishSignal = null;

	String riderName = null;
	long raceTime = 0L;

	public Rider(CountDownLatch raceStartSignal, CountDownLatch raceFinishSignal, String riderName, long raceTime) {
		this.raceStartSignal = raceStartSignal;
		this.raceFinishSignal = raceFinishSignal;
		this.riderName = riderName;
		this.raceTime = raceTime;
	}

	@Override
	public void run() {
		try {
			System.out.printf("%s arrived in the field and is ready to race!!!!!%n", this.riderName);
			this.raceStartSignal.await();
			System.out.printf("%s got signal to race!!!!!%n", this.riderName);
			System.out.printf("%s started the race!!!!!%n", this.riderName);
			TimeUnit.SECONDS.sleep(this.raceTime);
			System.out.printf("%s finished the race!!!!!%n", this.riderName);
			LatchDemo.riderPositions.add(this.riderName);
			this.raceFinishSignal.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
