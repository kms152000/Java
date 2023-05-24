package ch04.sec03;

public class SwitchExpressionsExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		//Java 12 이후부터는 switch 문에서 Expressions(표현식)을 사용할 수 있다.
		switch(grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다.");
		}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다.");
		}
		default -> {
			System.out.println("손님입니다.");
		}
		}
		switch(grade) {
			case 'A', 'a' -> System.out.println("우수 회원입니다.");
			case 'B', 'b' -> System.out.println("일반 회원입니다.");
			default -> 	System.out.println("손님입니다.");
		}
	}

}
