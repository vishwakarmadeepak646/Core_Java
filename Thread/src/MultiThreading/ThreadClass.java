package MultiThreading;

public class ThreadClass extends Thread{
	
	private String name;
	
	public ThreadClass(String name) {
		this.name = name;
			
		}
	
	// Thread having 3 methods 1. run() 2. start() 3. sleep()- we have to write it under try catch block.
	public void run() { // Run method use for scheduling the thread.
		for(int i = 1; i<11; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
			System.out.println(i + " = " + name);
		}
	}
	

}
