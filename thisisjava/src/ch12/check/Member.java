package ch12.check;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	//여기에 코드를 작성하세요.
	@Override 
	public String toString() {
		return id + ": " + name;
	}
}
