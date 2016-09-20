package pl.kasprowski.turtorials.impl21;

public class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;

	public ThreadDemo(String name) {
		this.threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread " + threadName + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + "interupted");
		}
		System.out.println(threadName + "exiting");
	}
	
	public void start (){
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread (this, threadName);
			t.start();
		}
	}

}
