package ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3; //hour 값을 3으로 초기화
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute; //변수 hour, minute 값을 읽고 연산 후 totalMinute에 저장 
		System.out.println("총 " + totalMinute + "분");
	}

}
