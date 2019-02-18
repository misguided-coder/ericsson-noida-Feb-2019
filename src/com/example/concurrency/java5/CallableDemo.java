package com.example.concurrency.java5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		Future<Integer> future = executor.submit(new CalTask());

		// 50 loc
		try {
			future.cancel(false);
			if (future.isCancelled()) {
				System.out.println("Task cancelled!!!!");
			} else {
				int rs = future.get();
				System.out.printf("Result : %s%n", rs);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		System.out.println("Finish Line!!!!!");
	}
}

class CalTask implements Callable<Integer> {

	public Integer call() {
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			result = result + i;
		}
		System.out.printf("CalTask done!!!%n");
		return result;
	}
}
