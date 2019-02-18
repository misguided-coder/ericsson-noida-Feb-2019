package com.example.concurrency.java5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadDemo {

	public static void main(String[] args) {

		//fix size pool
		//Executor executor = Executors.newFixedThreadPool(5000);
		
		//flexible size pool or scalable pool
		//Executor executor = Executors.newCachedThreadPool();
	
		//single thread pool
		//Executor executor = Executors.newSingleThreadExecutor();
	
		//task scheduling pool
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
	
		//User 1
		//executor.execute(new PrinterTask("ritesh-profile.doc",10));

		//User 2
		//executor.execute(new PrinterTask("sales.xls",6));

		//User 3
		//executor.execute(new PrinterTask("bank-statement.pdf",5));

		
	
		/*for(int i=0;i<10;i++) {
			executor.execute(new TaskA());
		}*/
		
		//executor.schedule(new EmailTask(), 10, TimeUnit.SECONDS);
		
		executor.scheduleAtFixedRate(new EmailTask(), 5, 2, TimeUnit.SECONDS);
		
		System.out.println("Finish Line!!!!!");

	}
}

class TaskA implements Runnable {

	public void run() {

		for (int i = 1; i <= 20; i++) {
			System.out.printf("I : %s done by %s worker!!!%n", i,Thread.currentThread().getName());
		}

	}
}


class PrinterTask implements Runnable {

	String docName;
	long printTime;
	
	public PrinterTask(String docName,long printTime) {
		this.docName = docName;
		this.printTime = printTime;
	}
	
	public void run() {			
		System.out.printf("%s document printing is going on!!!%n", this.docName);
		try {
			TimeUnit.SECONDS.sleep(this.printTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("%s document is printed by printer!!!%n", this.docName);
	}
}



class EmailTask implements Runnable {
	
	public void run() {			
		System.out.printf("Email is sent to Trumph!!%n");
	}
}

