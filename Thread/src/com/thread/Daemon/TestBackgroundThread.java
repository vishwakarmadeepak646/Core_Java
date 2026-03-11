package com.thread.Daemon;

public class TestBackgroundThread {

	public static void main(String[] args) {
		
		BackgroudThread t1 = new BackgroudThread("daemon thread");

		t1.setDaemon(true); // Using t.setDeamon(true) thread we can make any thread to deamon thread and Garbage collector is a Deamon thread given by Java
// deamon thread will end once normal thread ends
		t1.start();

		for (int i = 1; i <= 10; i++) {

			try {

				Thread.sleep(100);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println(i + " main");
		}


	}

}
