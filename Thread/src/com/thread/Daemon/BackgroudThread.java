package com.thread.Daemon;

public class BackgroudThread extends Thread {
	String name = null;

	public BackgroudThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		while (true) {

			try {

				Thread.sleep(200);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			System.out.println(name);
		}
	}

}
