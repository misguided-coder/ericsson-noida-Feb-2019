package com.example.concurrency.java5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolLifeCycleDemo {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i=0;i<20;i++) {
			executor.execute(new DBTask());
		}
		
		//executor.shutdown();
		executor.shutdownNow();
		System.out.println(executor.isShutdown());
		
		try {
			while(!executor.awaitTermination(5, TimeUnit.SECONDS)) {
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println("Pool got shut down!!!!!");
	}
	
}

class DBTask implements Runnable {
	
	public void run() {			
		System.out.printf("DB operation is done by %s !!%n",Thread.currentThread().getName());
	}
}

