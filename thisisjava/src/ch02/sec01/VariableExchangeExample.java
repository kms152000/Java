package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x; //x의 값 3을 temp에 저장
		x = y; //y의 값 5를 x에 저장
		y = temp; //temp의 값 3을 y에 저장
		System.out.println("x:" + x + ", y:" + y);

	}

}
