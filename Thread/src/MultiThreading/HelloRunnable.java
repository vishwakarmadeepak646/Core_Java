package MultiThreading;

public class HelloRunnable implements Runnable {

	// Runnable interface have only run() method.
	// Mostly Runnable interface is preferred bcz in Java one class can extends only single class  as per inheritance rule.
	// So we implements interface so that we can extends some other class which required.

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
