package ch12.check;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	//여기에 코드를 작성하세요.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}	

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}