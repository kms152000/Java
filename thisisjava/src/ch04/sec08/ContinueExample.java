package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				//System.out.print("홀수"); 홀수면 continue
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
