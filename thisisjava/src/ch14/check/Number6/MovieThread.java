package ch14.check.Number6;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			
			if(this.isInterrupted());
			break;
		}
	}
}
