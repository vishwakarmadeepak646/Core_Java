package MultiThreading;

public class JoinThread extends Thread{

	private String name;

	public JoinThread(String name) {
		this.name = name;

	}

	public void run() {
		for (int i = 1; i < 11; i++) {

			System.out.println(i + " = " + name);
		}
	}

}
