package ch14.sec07.exam02;

public class InterruptedExample {
	public static void main(String[] args) {
		Thread t = new PrintThread();
		t.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		t.interrupt();
	}
}
