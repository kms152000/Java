package ch04.check;

public class Number6 {

	public static void main(String[] args) {
		String star = "*";
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(star);
			}
			System.out.println(" ");
		}
	}

}
