package MultiThreading;

public class TestJoinThread {

	public static void main(String[] args) throws Exception {

		JoinThread t1 = new JoinThread("Ram");
		JoinThread t2 = new JoinThread("Kapil");
		JoinThread t3 = new JoinThread("Kisan");

		t1.start();

		// join() is used to set priority of method and wait other till join method recourse executed till end.

		t2.start(); // Start t2 first
		t2.join(); // Other thread including main thread Wait for t2 to complete first. This method need to write after start() method.

		t3.start(); // Start t1 or t3 after t1 complete
	}
}
