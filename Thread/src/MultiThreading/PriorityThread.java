package MultiThreading;

public class PriorityThread extends Thread{

	private String name;

	public PriorityThread(String name) {
		this.name = name;

	}

	public void run() {
		for (int i = 1; i < 11; i++) {

			System.out.println(i + " = " + name);
		}
	}

}
