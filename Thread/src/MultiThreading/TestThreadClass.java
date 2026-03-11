package MultiThreading;

public class TestThreadClass {
	
	public static void main(String args[]) {
		// We can create multiple thread
		//A thread can create another thread.
		// Newly created thread will be equally powerful to last thread.
		// If one thread dies, other will remain active in memory
		
		// Each thread perform operation 10 times as loop having 10 iteration.
		ThreadClass t1 = new ThreadClass("Ram");
		ThreadClass t2 = new ThreadClass("Shyam");
		
		t1.start(); // we have to call start() to execute the run() method without start() it will not able to execute the run() method.
		t2.start();
		
		// output every-times very bcz it's depends on memory allocated to thread.
		
		// we can set priority of thread
	}

}
