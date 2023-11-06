package ch15.check.Number8;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	//여기에 코드 작성
	
	//hashCode 재정의
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false; 
		
		Student student = (Student) obj;
		if(studentNum != student.studentNum) return false;
        return true;
	}
}
