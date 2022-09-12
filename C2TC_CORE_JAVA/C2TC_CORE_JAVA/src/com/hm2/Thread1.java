package com.hm2;

public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread m = new MyThread();
		m.start();		//start thread
		
		m.join(0);		//Schedule execution of thread
		
//		thread 1
		for(int i=0; i<10; i++)
		System.out.println("I am main thread");

	}
	
}

class MyThread extends Thread {
	
//	Thread 2
	
	public void run() {
	
		for(int i=0; i<10; i++)
			System.out.println("I am my thread");
		
		try {
			Thread.sleep(1000);		// Schedule execution of thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
}
