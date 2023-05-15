package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner 객체를 생성하고 scanner 변수를 생성해 대입한다.
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine(); //실행하면 키보드로 입력한 내용을 문자열로 읽고 좌측 String 변수에 저장할 수 있다. ENTER 키 입력 전까지는 블로킹(대기)상태이다.
		int x = Integer.parseInt(strX);
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) { //String 값이 동일한지 비교할 때는 equals()를 사용한다.
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println();
	}

}
