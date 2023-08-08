package ch08.sec10.sec02;

public class Bus implements Vehicle{
	//추가 메소드 재정의
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다.");
	}
	
	//추가 메소드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
