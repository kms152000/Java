package ch12.sec03.exam04;

public record Member(String id, String name, int age) {
	//레코드 소스를 컴파일하면 변수의 타입과 이름을 이용해서 private final 필드가 자동 생성되고, 
	//생성자 및 Getter 메소드가 자동으로 추가된다.
}
