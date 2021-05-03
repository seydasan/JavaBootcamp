
public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Buse","Koca","40987654321");
		//user.setId(1);
		//user.setFirstName("Buse");
		//user.setLastName("Koca");
		//user.setNationalIdentity("40987654321");
		
		Student student=new Student();
		student.setFirstName("Akif");
		student.setLastName("Sönmez");
		student.setNationalIdentity("56784538234");
		student.setStudentNumber(388);
		student.setCourse("Java");
		
		Instructor instructor=new Instructor();
		instructor.setFirstName("Olcay");
		instructor.setLastName("Yılmaz");
		instructor.setNationalIdentity("98765432123");
		instructor.setInstructorNumber(678);
		instructor.setCourse("C#");

		System.out.println("");
		UserManager userManager=new UserManager();
		userManager.CreateNewUser(user);
		userManager.UpdateUser(user);
		userManager.DeleteUser(user);
		
		StudentManager studentManager= new StudentManager();
		studentManager.RegisterCourse(student);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.CreateNewCourse(instructor);
		
		System.out.println("");
		
		User[] users= {user,student,instructor};
		System.out.println("Sistemdeki tüm kullanıcılar");
		userManager.GetAllUsers(users);
	}

}
