package ch11.sec06;

public class InsufficientException extends Exception {
	//기본 생성자
	public InsufficientException() {
		
	}
	
	//예외 메세지를 입력받는 생성자
	public InsufficientException(String message) {
		super(message);
	}
}
