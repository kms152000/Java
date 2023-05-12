package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		int var1 = 10; //int의 크기는 4바이트
		byte var2 = (byte) var1; //byte의 크기는 1바이트 = 8비트
		System.out.println(var2);
		
		long var3 = 300; //long의 크기는 8바이트
		int var4 = (int) var3; //int의 크기는 4바이트
		System.out.println(var4);
		
		long var5 = 65; //long의 크기는 8바이트
		char var6 = (char) var5; //char의 크기는 2바이트 (유니코드: 0~65535)
		System.out.println(var6);
		
		double var7 = 3.14; //double의 크기는 8바이트
		int var8 = (int) var7; //int의 크기는 4바이트
		System.out.println(var8); //정수형은 실수의 소수점을 표현 못하므로 정수 부분만 출력
	}

}
