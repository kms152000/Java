package ch12.sec04;

public class GetPropertyExample {
	public static void main(String[] args) {
		//운영체제와 사용자 정보 출력
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("userName");
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
	
		
	}
}
