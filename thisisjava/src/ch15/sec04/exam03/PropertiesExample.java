package ch15.sec04.exam03;

import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		//Properties 컬렉션 생성
		Properties p = new Properties();
		
		//PropertiesExample.class와 동일한 ClassPath에 있는 database.properties 파일 로드
		p.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		
		//주어진 키에 대한 값 읽기
		String driver = p.getProperty("driver");
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		String admin = p.getProperty("admin");
		
		//값 출력
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("admin : " + admin);
	}
}
