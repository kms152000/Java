package ch04.check;

import java.util.Scanner;

public class Number7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true; 
		int money = 0;
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | "+"2.출금 | "+"3.잔고 | "+"4.종료" );
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			String kbNum = scanner.nextLine();
			
			if(kbNum.equals("1")) {
				System.out.print("예금액>");
				String save = scanner.nextLine();
				money += Integer.parseInt(save) ;
			} else if(kbNum.equals("2")) {
				System.out.print("출금액>");
				String give = scanner.nextLine();
				money -= Integer.parseInt(give) ;
			} else if(kbNum.equals("3")) {
				System.out.print("잔고>" + money +"\n");
			} else if(kbNum.equals("4")) {
				System.out.print("\n프로그램 종료");
				run = false;
			} 
			System.out.println();
		}
		
	}

}
