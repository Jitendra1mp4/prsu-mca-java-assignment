import myPack.*;
public class WaitAndNotify {
	public static void main(String[] args) {
		new Intro("Wait and notify method") ;
		SharedData shared = new SharedData();

		Thread proThread = new Thread(() -> {
			try {
				shared.produce("how are you");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread conThread = new Thread(() -> {
			try {
				shared.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		proThread.start();
		conThread.start();

	}
}

class SharedData {
	private String msg;
	private boolean isProduced = false;

	public synchronized void produce(String msg) throws InterruptedException {
		while (isProduced) {
			wait();
		}
		this.msg = msg;
		System.out.println("Produced : " + msg);
		isProduced = true;
		notify();
	}

	public synchronized void consume() throws InterruptedException {
		while (!isProduced) {
			wait();
		}
		System.out.println("consumed : " + msg);
		isProduced = !isProduced;
		notify();
	}
}