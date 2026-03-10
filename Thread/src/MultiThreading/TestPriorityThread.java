package MultiThreading;

public class TestPriorityThread {

	public static void main(String[] args) {
	
		PriorityThread t1 = new PriorityThread("Ram");
		PriorityThread t2 = new PriorityThread("Shayam");
		PriorityThread t3 = new PriorityThread("Krishna");
		
		// Set thread Priorities
		//Default priority is 5 
		t1.setPriority(t1.MAX_PRIORITY); // Maximum Priority is 10 , we can also write MAX_PRIORITY
		t2.setPriority(Thread.MIN_PRIORITY);  // Maximum Priority is 1
		
		t1.start();
		t2.start();
		t3.start(); // It having default priority Thread.NORM_PRIORITY

	}

}
