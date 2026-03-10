package MultiThreading;

public class TestHelloRunnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new HelloRunnable("Ram")); // Here we create object of Thread class and execute run() method of Runnable interface 
															// so that we have to pass object of Runnable interface class
													
		Thread t2 = new Thread(new HelloRunnable("Shyam"));
		
		t1.start();
		t2.start();
	}
}
