package ch14.sec06.exam02;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject wo = new WorkObject();
		
		ThreadA tA = new ThreadA(wo);
		ThreadB tB = new ThreadB(wo);
		
		tA.start();
		tB.start();
	}
}
