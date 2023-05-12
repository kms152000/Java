package ch02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		//str1과 str2는 동일한 문자열이 저장된다.
		String str1 = "" + //이 방식은 줄마다 문자열로 저장 해야한다
		"{\n" +
		"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\"\n" +
		"}";
		
		// 큰따옴표 3개로 감싸서 저장하는 기능은 Java 13부터 제공한다. 
		String str2 = """ 
				{
					"id":"winter",
					"name":"눈송이"
				""";
		
		System.out.println(str1);
		System.out.println("-----------------------");
		System.out.println(str2);
		System.out.println("-----------------------");
		
		//줄바꿈 기능은 \n에 해당된다. 줄바꿈 말고 다음 줄에 이어 작성하고 싶으면 맨 끝에 \를 붙여주면 된다. 이 기능은 Java 14부터 적용된다. 
		String str = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될 겁니다.
				""";
		System.out.println(str);
	}

}
