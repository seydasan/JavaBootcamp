
public class Student extends User {
	
	private int studentNumber;
	private String course;

	public Student() {}
	public Student(int studentNumber,String course) {
		super();
		this.studentNumber = studentNumber;
		this.course = course;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
