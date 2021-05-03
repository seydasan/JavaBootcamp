
public class Instructor extends User {
	
	private int instructorNumber;
	private String course;
	
	public Instructor() {
	}
	public Instructor(int instructorNumber, String course) {
		super();
		this.instructorNumber = instructorNumber;
		this.course = course;
	}
	public int getInstructorNumber() {
		return instructorNumber;
	}
	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
