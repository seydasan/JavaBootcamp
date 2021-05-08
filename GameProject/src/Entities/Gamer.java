package Entities;
import Abstract.Entity;

public class Gamer implements Entity
{
	private int id;
	private String firstName;
	private String lastName;
	private int DateOfBirth;
	private String NationalityId;
	private String Email;
	
	public Gamer() {}

	public Gamer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
		Email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
}
