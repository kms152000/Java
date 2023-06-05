package ch04.check;

public class Number4 {

	public static void main(String[] args) {
		while(true) {
			int st = (int) ((Math.random()*6)+1);
			int nd = (int) ((Math.random()*6)+1);
			System.out.println("("+st+", "+nd+")");
			
			if(st+nd==5) {
				break;
			}
		}
		
	}

}
