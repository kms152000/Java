package ch12.check;

import java.util.StringTokenizer;

public class Number11 {
	public static void main(String[] args) {
		String data1 = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(data1, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
}
