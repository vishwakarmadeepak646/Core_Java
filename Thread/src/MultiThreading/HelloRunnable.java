package MultiThreading;

public class HelloRunnable implements Runnable {

	// Runnable interface only having run() method.
	// Mostly Runnable interface is preferred bcz in Java 1 class can extends only single class,
	//  So we implements interface so that we can extends some other class which required.

	private String name = null;

	public HelloRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage()); 
			}
			
			System.out.println(i + " = " + name);
		}

	}

}
